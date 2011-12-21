/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 业务对象 Generate Date 2011-09-22 10:16:35
 *
 * @author Auto Gen
 */
public class BusinessObject implements java.io.Serializable {
    /**
     * Creates a new BusinessObject object.
     */
    public BusinessObject() {
        super();
    } // end BusinessObject()

    /** Attribute */
    private long businessObjectId;

    /** Attribute  Be Seted Falg */
    private boolean businessObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessObjectIdNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private Long generateOption;

    /** Attribute  Be Seted Falg */
    private boolean generateOptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean generateOptionNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private long packageId;

    /** Attribute  Be Seted Falg */
    private boolean packageIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean packageIdNull = false;

    /** Attribute */
    private String state;

    /** Attribute  Be Seted Falg */
    private boolean stateSetted = false;

    /** Attribute  is Null Falg */
    private boolean stateNull = false;

    /** Attribute */
    private String type;

    /** Attribute  Be Seted Falg */
    private boolean typeSetted = false;

    /** Attribute  is Null Falg */
    private boolean typeNull = false;

    /** Attribute */
    private long domainId;

    /** Attribute  Be Seted Falg */
    private boolean domainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIdNull = false;

    /** Attribute */
    private String domainName;

    /** Attribute  Be Seted Falg */
    private boolean domainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainNameNull = false;

    /** Attribute */
    private String packageName;

    /** Attribute  Be Seted Falg */
    private boolean packageNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean packageNameNull = false;

    /**
     * Get BusinessObjectId
     *
     * @return businessObjectId
     */
    final public long getBusinessObjectId() {
        return businessObjectId;
    } // end getBusinessObjectId()

    /**
     * Set BusinessObjectId
     *
     * @param aBusinessObjectId
     */
    final public void setBusinessObjectId(long aBusinessObjectId) {
        this.businessObjectId = aBusinessObjectId;

        this.businessObjectIdSetted = true;

        this.setBusinessObjectIdNull(false);
    } // end setBusinessObjectId()

    /**
     * Get BusinessObjectId Has Been Setted
     *
     * @return businessObjectId
     */
    final public boolean isBusinessObjectIdSetted() {
        return this.businessObjectIdSetted;
    } // end isBusinessObjectIdSetted()

    /**
     * Set BusinessObjectId Null
     */
    final public void setBusinessObjectIdNull() {
        this.businessObjectIdNull = true;
    } // end setBusinessObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessObjectIdNull(boolean aNullFlag) {
        this.businessObjectIdNull = aNullFlag;
    } // end setBusinessObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessObjectIdNull() {
        return this.businessObjectIdNull;
    } // end isBusinessObjectIdNull()

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
     * Get GenerateOption
     *
     * @return generateOption
     */
    final public Long getGenerateOption() {
        return generateOption;
    } // end getGenerateOption()

    /**
     * Set GenerateOption
     *
     * @param aGenerateOption
     */
    final public void setGenerateOption(Long aGenerateOption) {
        this.generateOption = aGenerateOption;

        this.generateOptionSetted = true;

        this.setGenerateOptionNull(this.generateOption == null);
    } // end setGenerateOption()

    /**
     * Get GenerateOption Has Been Setted
     *
     * @return generateOption
     */
    final public boolean isGenerateOptionSetted() {
        return this.generateOptionSetted;
    } // end isGenerateOptionSetted()

    /**
     * Set GenerateOption Null
     */
    final public void setGenerateOptionNull() {
        this.generateOptionNull = true;
    } // end setGenerateOptionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setGenerateOptionNull(boolean aNullFlag) {
        this.generateOptionNull = aNullFlag;
    } // end setGenerateOptionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isGenerateOptionNull() {
        return this.generateOptionNull;
    } // end isGenerateOptionNull()

    /**
     * Get Name
     *
     * @return name
     */
    final public String getName() {
        return name;
    } // end getName()

    /**
     * Set Name
     *
     * @param aName
     */
    final public void setName(String aName) {
        this.name = aName;

        this.nameSetted = true;

        this.setNameNull(this.name == null);
    } // end setName()

    /**
     * Get Name Has Been Setted
     *
     * @return name
     */
    final public boolean isNameSetted() {
        return this.nameSetted;
    } // end isNameSetted()

    /**
     * Set Name Null
     */
    final public void setNameNull() {
        this.nameNull = true;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setNameNull(boolean aNullFlag) {
        this.nameNull = aNullFlag;
    } // end setNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isNameNull() {
        return this.nameNull;
    } // end isNameNull()

    /**
     * Get PackageId
     *
     * @return packageId
     */
    final public long getPackageId() {
        return packageId;
    } // end getPackageId()

    /**
     * Set PackageId
     *
     * @param aPackageId
     */
    final public void setPackageId(long aPackageId) {
        this.packageId = aPackageId;

        this.packageIdSetted = true;

        this.setPackageIdNull(false);
    } // end setPackageId()

    /**
     * Get PackageId Has Been Setted
     *
     * @return packageId
     */
    final public boolean isPackageIdSetted() {
        return this.packageIdSetted;
    } // end isPackageIdSetted()

    /**
     * Set PackageId Null
     */
    final public void setPackageIdNull() {
        this.packageIdNull = true;
    } // end setPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPackageIdNull(boolean aNullFlag) {
        this.packageIdNull = aNullFlag;
    } // end setPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPackageIdNull() {
        return this.packageIdNull;
    } // end isPackageIdNull()

    /**
     * Get State
     *
     * @return state
     */
    final public String getState() {
        return state;
    } // end getState()

    /**
     * Set State
     *
     * @param aState
     */
    final public void setState(String aState) {
        this.state = aState;

        this.stateSetted = true;

        this.setStateNull(this.state == null);
    } // end setState()

    /**
     * Get State Has Been Setted
     *
     * @return state
     */
    final public boolean isStateSetted() {
        return this.stateSetted;
    } // end isStateSetted()

    /**
     * Set State Null
     */
    final public void setStateNull() {
        this.stateNull = true;
    } // end setStateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStateNull(boolean aNullFlag) {
        this.stateNull = aNullFlag;
    } // end setStateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStateNull() {
        return this.stateNull;
    } // end isStateNull()

    /**
     * Get Type
     *
     * @return type
     */
    final public String getType() {
        return type;
    } // end getType()

    /**
     * Set Type
     *
     * @param aType
     */
    final public void setType(String aType) {
        this.type = aType;

        this.typeSetted = true;

        this.setTypeNull(this.type == null);
    } // end setType()

    /**
     * Get Type Has Been Setted
     *
     * @return type
     */
    final public boolean isTypeSetted() {
        return this.typeSetted;
    } // end isTypeSetted()

    /**
     * Set Type Null
     */
    final public void setTypeNull() {
        this.typeNull = true;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setTypeNull(boolean aNullFlag) {
        this.typeNull = aNullFlag;
    } // end setTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isTypeNull() {
        return this.typeNull;
    } // end isTypeNull()

    /**
     * Get DomainId
     *
     * @return domainId
     */
    final public long getDomainId() {
        return domainId;
    } // end getDomainId()

    /**
     * Set DomainId
     *
     * @param aDomainId
     */
    final public void setDomainId(long aDomainId) {
        this.domainId = aDomainId;

        this.domainIdSetted = true;

        this.setDomainIdNull(false);
    } // end setDomainId()

    /**
     * Get DomainId Has Been Setted
     *
     * @return domainId
     */
    final public boolean isDomainIdSetted() {
        return this.domainIdSetted;
    } // end isDomainIdSetted()

    /**
     * Set DomainId Null
     */
    final public void setDomainIdNull() {
        this.domainIdNull = true;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainIdNull(boolean aNullFlag) {
        this.domainIdNull = aNullFlag;
    } // end setDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainIdNull() {
        return this.domainIdNull;
    } // end isDomainIdNull()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    final public String getDomainName() {
        return domainName;
    } // end getDomainName()

    /**
     * Set DomainName
     *
     * @param aDomainName
     */
    final public void setDomainName(String aDomainName) {
        this.domainName = aDomainName;

        this.domainNameSetted = true;

        this.setDomainNameNull(this.domainName == null);
    } // end setDomainName()

    /**
     * Get DomainName Has Been Setted
     *
     * @return domainName
     */
    final public boolean isDomainNameSetted() {
        return this.domainNameSetted;
    } // end isDomainNameSetted()

    /**
     * Set DomainName Null
     */
    final public void setDomainNameNull() {
        this.domainNameNull = true;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainNameNull(boolean aNullFlag) {
        this.domainNameNull = aNullFlag;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainNameNull() {
        return this.domainNameNull;
    } // end isDomainNameNull()

    /**
     * Get PackageName
     *
     * @return packageName
     */
    final public String getPackageName() {
        return packageName;
    } // end getPackageName()

    /**
     * Set PackageName
     *
     * @param aPackageName
     */
    final public void setPackageName(String aPackageName) {
        this.packageName = aPackageName;

        this.packageNameSetted = true;

        this.setPackageNameNull(this.packageName == null);
    } // end setPackageName()

    /**
     * Get PackageName Has Been Setted
     *
     * @return packageName
     */
    final public boolean isPackageNameSetted() {
        return this.packageNameSetted;
    } // end isPackageNameSetted()

    /**
     * Set PackageName Null
     */
    final public void setPackageNameNull() {
        this.packageNameNull = true;
    } // end setPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPackageNameNull(boolean aNullFlag) {
        this.packageNameNull = aNullFlag;
    } // end setPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPackageNameNull() {
        return this.packageNameNull;
    } // end isPackageNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getBusinessObjectId() ^ (getBusinessObjectId() >>> 32));

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

        if ((obj instanceof BusinessObject) == false) {
            return false;
        } // end if

        BusinessObject other = (BusinessObject) obj;

        if (other == this) {
            return true;
        } // end if

        if (getBusinessObjectId() != other.getBusinessObjectId()) {
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

        buffer.append("businessObjectId=");
        buffer.append(this.businessObjectId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("generateOption=");
        buffer.append(this.generateOption);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("packageId=");
        buffer.append(this.packageId);
        buffer.append("\r\n");

        buffer.append("state=");
        buffer.append(this.state);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("domainId=");
        buffer.append(this.domainId);
        buffer.append("\r\n");

        buffer.append("domainName=");
        buffer.append(this.domainName);
        buffer.append("\r\n");

        buffer.append("packageName=");
        buffer.append(this.packageName);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessObject
