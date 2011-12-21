/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 对象关联关系 Generate Date 2011-09-22 10:16:43
 *
 * @author Auto Gen
 */
public class ObjectRelation implements java.io.Serializable {
    /**
     * Creates a new ObjectRelation object.
     */
    public ObjectRelation() {
        super();
    } // end ObjectRelation()

    /** Attribute */
    private long objectRelationId;

    /** Attribute  Be Seted Falg */
    private boolean objectRelationIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectRelationIdNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private long objectId;

    /** Attribute  Be Seted Falg */
    private boolean objectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectIdNull = false;

    /** Attribute */
    private long relatedObjectId;

    /** Attribute  Be Seted Falg */
    private boolean relatedObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedObjectIdNull = false;

    /** Attribute */
    private String relateConfig;

    /** Attribute  Be Seted Falg */
    private boolean relateConfigSetted = false;

    /** Attribute  is Null Falg */
    private boolean relateConfigNull = false;

    /** Attribute */
    private String relateType;

    /** Attribute  Be Seted Falg */
    private boolean relateTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean relateTypeNull = false;

    /** Attribute */
    private String relatedBusinessObjectName;

    /** Attribute  Be Seted Falg */
    private boolean relatedBusinessObjectNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedBusinessObjectNameNull = false;

    /** Attribute */
    private String relatedBusinessObjectType;

    /** Attribute  Be Seted Falg */
    private boolean relatedBusinessObjectTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedBusinessObjectTypeNull = false;

    /** Attribute */
    private String relatedBusinessPackageName;

    /** Attribute  Be Seted Falg */
    private boolean relatedBusinessPackageNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedBusinessPackageNameNull = false;

    /** Attribute */
    private long relatedBusinessPackageId;

    /** Attribute  Be Seted Falg */
    private boolean relatedBusinessPackageIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean relatedBusinessPackageIdNull = false;

    /**
     * Get ObjectRelationId
     *
     * @return objectRelationId
     */
    final public long getObjectRelationId() {
        return objectRelationId;
    } // end getObjectRelationId()

    /**
     * Set ObjectRelationId
     *
     * @param aObjectRelationId
     */
    final public void setObjectRelationId(long aObjectRelationId) {
        this.objectRelationId = aObjectRelationId;

        this.objectRelationIdSetted = true;

        this.setObjectRelationIdNull(false);
    } // end setObjectRelationId()

    /**
     * Get ObjectRelationId Has Been Setted
     *
     * @return objectRelationId
     */
    final public boolean isObjectRelationIdSetted() {
        return this.objectRelationIdSetted;
    } // end isObjectRelationIdSetted()

    /**
     * Set ObjectRelationId Null
     */
    final public void setObjectRelationIdNull() {
        this.objectRelationIdNull = true;
    } // end setObjectRelationIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectRelationIdNull(boolean aNullFlag) {
        this.objectRelationIdNull = aNullFlag;
    } // end setObjectRelationIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectRelationIdNull() {
        return this.objectRelationIdNull;
    } // end isObjectRelationIdNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        return description;
    } // end getDescription()

    /**
     * Set Description
     *
     * @param aDescription
     */
    final public void setDescription(String aDescription) {
        this.description = aDescription;

        this.descriptionSetted = true;

        this.setDescriptionNull(this.description == null);
    } // end setDescription()

    /**
     * Get Description Has Been Setted
     *
     * @return description
     */
    final public boolean isDescriptionSetted() {
        return this.descriptionSetted;
    } // end isDescriptionSetted()

    /**
     * Set Description Null
     */
    final public void setDescriptionNull() {
        this.descriptionNull = true;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDescriptionNull(boolean aNullFlag) {
        this.descriptionNull = aNullFlag;
    } // end setDescriptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDescriptionNull() {
        return this.descriptionNull;
    } // end isDescriptionNull()

    /**
     * Get ObjectId
     *
     * @return objectId
     */
    final public long getObjectId() {
        return objectId;
    } // end getObjectId()

    /**
     * Set ObjectId
     *
     * @param aObjectId
     */
    final public void setObjectId(long aObjectId) {
        this.objectId = aObjectId;

        this.objectIdSetted = true;

        this.setObjectIdNull(false);
    } // end setObjectId()

    /**
     * Get ObjectId Has Been Setted
     *
     * @return objectId
     */
    final public boolean isObjectIdSetted() {
        return this.objectIdSetted;
    } // end isObjectIdSetted()

    /**
     * Set ObjectId Null
     */
    final public void setObjectIdNull() {
        this.objectIdNull = true;
    } // end setObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectIdNull(boolean aNullFlag) {
        this.objectIdNull = aNullFlag;
    } // end setObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectIdNull() {
        return this.objectIdNull;
    } // end isObjectIdNull()

    /**
     * Get RelatedObjectId
     *
     * @return relatedObjectId
     */
    final public long getRelatedObjectId() {
        return relatedObjectId;
    } // end getRelatedObjectId()

    /**
     * Set RelatedObjectId
     *
     * @param aRelatedObjectId
     */
    final public void setRelatedObjectId(long aRelatedObjectId) {
        this.relatedObjectId = aRelatedObjectId;

        this.relatedObjectIdSetted = true;

        this.setRelatedObjectIdNull(false);
    } // end setRelatedObjectId()

    /**
     * Get RelatedObjectId Has Been Setted
     *
     * @return relatedObjectId
     */
    final public boolean isRelatedObjectIdSetted() {
        return this.relatedObjectIdSetted;
    } // end isRelatedObjectIdSetted()

    /**
     * Set RelatedObjectId Null
     */
    final public void setRelatedObjectIdNull() {
        this.relatedObjectIdNull = true;
    } // end setRelatedObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedObjectIdNull(boolean aNullFlag) {
        this.relatedObjectIdNull = aNullFlag;
    } // end setRelatedObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedObjectIdNull() {
        return this.relatedObjectIdNull;
    } // end isRelatedObjectIdNull()

    /**
     * Get RelateConfig
     *
     * @return relateConfig
     */
    final public String getRelateConfig() {
        return relateConfig;
    } // end getRelateConfig()

    /**
     * Set RelateConfig
     *
     * @param aRelateConfig
     */
    final public void setRelateConfig(String aRelateConfig) {
        this.relateConfig = aRelateConfig;

        this.relateConfigSetted = true;

        this.setRelateConfigNull(this.relateConfig == null);
    } // end setRelateConfig()

    /**
     * Get RelateConfig Has Been Setted
     *
     * @return relateConfig
     */
    final public boolean isRelateConfigSetted() {
        return this.relateConfigSetted;
    } // end isRelateConfigSetted()

    /**
     * Set RelateConfig Null
     */
    final public void setRelateConfigNull() {
        this.relateConfigNull = true;
    } // end setRelateConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelateConfigNull(boolean aNullFlag) {
        this.relateConfigNull = aNullFlag;
    } // end setRelateConfigNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelateConfigNull() {
        return this.relateConfigNull;
    } // end isRelateConfigNull()

    /**
     * Get RelateType
     *
     * @return relateType
     */
    final public String getRelateType() {
        return relateType;
    } // end getRelateType()

    /**
     * Set RelateType
     *
     * @param aRelateType
     */
    final public void setRelateType(String aRelateType) {
        this.relateType = aRelateType;

        this.relateTypeSetted = true;

        this.setRelateTypeNull(this.relateType == null);
    } // end setRelateType()

    /**
     * Get RelateType Has Been Setted
     *
     * @return relateType
     */
    final public boolean isRelateTypeSetted() {
        return this.relateTypeSetted;
    } // end isRelateTypeSetted()

    /**
     * Set RelateType Null
     */
    final public void setRelateTypeNull() {
        this.relateTypeNull = true;
    } // end setRelateTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelateTypeNull(boolean aNullFlag) {
        this.relateTypeNull = aNullFlag;
    } // end setRelateTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelateTypeNull() {
        return this.relateTypeNull;
    } // end isRelateTypeNull()

    /**
     * Get RelatedBusinessObjectName
     *
     * @return relatedBusinessObjectName
     */
    final public String getRelatedBusinessObjectName() {
        return relatedBusinessObjectName;
    } // end getRelatedBusinessObjectName()

    /**
     * Set RelatedBusinessObjectName
     *
     * @param aRelatedBusinessObjectName
     */
    final public void setRelatedBusinessObjectName(
        String aRelatedBusinessObjectName) {
        this.relatedBusinessObjectName = aRelatedBusinessObjectName;

        this.relatedBusinessObjectNameSetted = true;

        this.setRelatedBusinessObjectNameNull(this.relatedBusinessObjectName == null);
    } // end setRelatedBusinessObjectName()

    /**
     * Get RelatedBusinessObjectName Has Been Setted
     *
     * @return relatedBusinessObjectName
     */
    final public boolean isRelatedBusinessObjectNameSetted() {
        return this.relatedBusinessObjectNameSetted;
    } // end isRelatedBusinessObjectNameSetted()

    /**
     * Set RelatedBusinessObjectName Null
     */
    final public void setRelatedBusinessObjectNameNull() {
        this.relatedBusinessObjectNameNull = true;
    } // end setRelatedBusinessObjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedBusinessObjectNameNull(boolean aNullFlag) {
        this.relatedBusinessObjectNameNull = aNullFlag;
    } // end setRelatedBusinessObjectNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedBusinessObjectNameNull() {
        return this.relatedBusinessObjectNameNull;
    } // end isRelatedBusinessObjectNameNull()

    /**
     * Get RelatedBusinessObjectType
     *
     * @return relatedBusinessObjectType
     */
    final public String getRelatedBusinessObjectType() {
        return relatedBusinessObjectType;
    } // end getRelatedBusinessObjectType()

    /**
     * Set RelatedBusinessObjectType
     *
     * @param aRelatedBusinessObjectType
     */
    final public void setRelatedBusinessObjectType(
        String aRelatedBusinessObjectType) {
        this.relatedBusinessObjectType = aRelatedBusinessObjectType;

        this.relatedBusinessObjectTypeSetted = true;

        this.setRelatedBusinessObjectTypeNull(this.relatedBusinessObjectType == null);
    } // end setRelatedBusinessObjectType()

    /**
     * Get RelatedBusinessObjectType Has Been Setted
     *
     * @return relatedBusinessObjectType
     */
    final public boolean isRelatedBusinessObjectTypeSetted() {
        return this.relatedBusinessObjectTypeSetted;
    } // end isRelatedBusinessObjectTypeSetted()

    /**
     * Set RelatedBusinessObjectType Null
     */
    final public void setRelatedBusinessObjectTypeNull() {
        this.relatedBusinessObjectTypeNull = true;
    } // end setRelatedBusinessObjectTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedBusinessObjectTypeNull(boolean aNullFlag) {
        this.relatedBusinessObjectTypeNull = aNullFlag;
    } // end setRelatedBusinessObjectTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedBusinessObjectTypeNull() {
        return this.relatedBusinessObjectTypeNull;
    } // end isRelatedBusinessObjectTypeNull()

    /**
     * Get RelatedBusinessPackageName
     *
     * @return relatedBusinessPackageName
     */
    final public String getRelatedBusinessPackageName() {
        return relatedBusinessPackageName;
    } // end getRelatedBusinessPackageName()

    /**
     * Set RelatedBusinessPackageName
     *
     * @param aRelatedBusinessPackageName
     */
    final public void setRelatedBusinessPackageName(
        String aRelatedBusinessPackageName) {
        this.relatedBusinessPackageName = aRelatedBusinessPackageName;

        this.relatedBusinessPackageNameSetted = true;

        this.setRelatedBusinessPackageNameNull(this.relatedBusinessPackageName == null);
    } // end setRelatedBusinessPackageName()

    /**
     * Get RelatedBusinessPackageName Has Been Setted
     *
     * @return relatedBusinessPackageName
     */
    final public boolean isRelatedBusinessPackageNameSetted() {
        return this.relatedBusinessPackageNameSetted;
    } // end isRelatedBusinessPackageNameSetted()

    /**
     * Set RelatedBusinessPackageName Null
     */
    final public void setRelatedBusinessPackageNameNull() {
        this.relatedBusinessPackageNameNull = true;
    } // end setRelatedBusinessPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedBusinessPackageNameNull(boolean aNullFlag) {
        this.relatedBusinessPackageNameNull = aNullFlag;
    } // end setRelatedBusinessPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedBusinessPackageNameNull() {
        return this.relatedBusinessPackageNameNull;
    } // end isRelatedBusinessPackageNameNull()

    /**
     * Get RelatedBusinessPackageId
     *
     * @return relatedBusinessPackageId
     */
    final public long getRelatedBusinessPackageId() {
        return relatedBusinessPackageId;
    } // end getRelatedBusinessPackageId()

    /**
     * Set RelatedBusinessPackageId
     *
     * @param aRelatedBusinessPackageId
     */
    final public void setRelatedBusinessPackageId(
        long aRelatedBusinessPackageId) {
        this.relatedBusinessPackageId = aRelatedBusinessPackageId;

        this.relatedBusinessPackageIdSetted = true;

        this.setRelatedBusinessPackageIdNull(false);
    } // end setRelatedBusinessPackageId()

    /**
     * Get RelatedBusinessPackageId Has Been Setted
     *
     * @return relatedBusinessPackageId
     */
    final public boolean isRelatedBusinessPackageIdSetted() {
        return this.relatedBusinessPackageIdSetted;
    } // end isRelatedBusinessPackageIdSetted()

    /**
     * Set RelatedBusinessPackageId Null
     */
    final public void setRelatedBusinessPackageIdNull() {
        this.relatedBusinessPackageIdNull = true;
    } // end setRelatedBusinessPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRelatedBusinessPackageIdNull(boolean aNullFlag) {
        this.relatedBusinessPackageIdNull = aNullFlag;
    } // end setRelatedBusinessPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRelatedBusinessPackageIdNull() {
        return this.relatedBusinessPackageIdNull;
    } // end isRelatedBusinessPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getObjectRelationId() ^ (getObjectRelationId() >>> 32));

        return result;
    } // end hashCode()

    /**
     * DOCUMENT ME!
     *
     * @param obj DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // end if

        if ((obj instanceof ObjectRelation) == false) {
            return false;
        } // end if

        ObjectRelation other = (ObjectRelation) obj;

        if (other == this) {
            return true;
        } // end if

        if (getObjectRelationId() != other.getObjectRelationId()) {
            return false;
        } // end if

        return true;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer(super.toString());

        buffer.append("[\r\n");

        buffer.append("objectRelationId=");
        buffer.append(this.objectRelationId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("objectId=");
        buffer.append(this.objectId);
        buffer.append("\r\n");

        buffer.append("relatedObjectId=");
        buffer.append(this.relatedObjectId);
        buffer.append("\r\n");

        buffer.append("relateConfig=");
        buffer.append(this.relateConfig);
        buffer.append("\r\n");

        buffer.append("relateType=");
        buffer.append(this.relateType);
        buffer.append("\r\n");

        buffer.append("relatedBusinessObjectName=");
        buffer.append(this.relatedBusinessObjectName);
        buffer.append("\r\n");

        buffer.append("relatedBusinessObjectType=");
        buffer.append(this.relatedBusinessObjectType);
        buffer.append("\r\n");

        buffer.append("relatedBusinessPackageName=");
        buffer.append(this.relatedBusinessPackageName);
        buffer.append("\r\n");

        buffer.append("relatedBusinessPackageId=");
        buffer.append(this.relatedBusinessPackageId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ObjectRelation
