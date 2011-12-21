/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 业务对象包 Generate Date 2011-09-22 10:16:38
 *
 * @author Auto Gen
 */
public class BusinessPackage implements java.io.Serializable {
    /**
     * Creates a new BusinessPackage object.
     */
    public BusinessPackage() {
        super();
    } // end BusinessPackage()

    /** Attribute */
    private long businessPackageId;

    /** Attribute  Be Seted Falg */
    private boolean businessPackageIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessPackageIdNull = false;

    /** Attribute */
    private long businessDomainId;

    /** Attribute  Be Seted Falg */
    private boolean businessDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessDomainIdNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private Long parentPackageId;

    /** Attribute  Be Seted Falg */
    private boolean parentPackageIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentPackageIdNull = false;

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

    /**
     * Get BusinessPackageId
     *
     * @return businessPackageId
     */
    final public long getBusinessPackageId() {
        return businessPackageId;
    } // end getBusinessPackageId()

    /**
     * Set BusinessPackageId
     *
     * @param aBusinessPackageId
     */
    final public void setBusinessPackageId(long aBusinessPackageId) {
        this.businessPackageId = aBusinessPackageId;

        this.businessPackageIdSetted = true;

        this.setBusinessPackageIdNull(false);
    } // end setBusinessPackageId()

    /**
     * Get BusinessPackageId Has Been Setted
     *
     * @return businessPackageId
     */
    final public boolean isBusinessPackageIdSetted() {
        return this.businessPackageIdSetted;
    } // end isBusinessPackageIdSetted()

    /**
     * Set BusinessPackageId Null
     */
    final public void setBusinessPackageIdNull() {
        this.businessPackageIdNull = true;
    } // end setBusinessPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessPackageIdNull(boolean aNullFlag) {
        this.businessPackageIdNull = aNullFlag;
    } // end setBusinessPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessPackageIdNull() {
        return this.businessPackageIdNull;
    } // end isBusinessPackageIdNull()

    /**
     * Get BusinessDomainId
     *
     * @return businessDomainId
     */
    final public long getBusinessDomainId() {
        return businessDomainId;
    } // end getBusinessDomainId()

    /**
     * Set BusinessDomainId
     *
     * @param aBusinessDomainId
     */
    final public void setBusinessDomainId(long aBusinessDomainId) {
        this.businessDomainId = aBusinessDomainId;

        this.businessDomainIdSetted = true;

        this.setBusinessDomainIdNull(false);
    } // end setBusinessDomainId()

    /**
     * Get BusinessDomainId Has Been Setted
     *
     * @return businessDomainId
     */
    final public boolean isBusinessDomainIdSetted() {
        return this.businessDomainIdSetted;
    } // end isBusinessDomainIdSetted()

    /**
     * Set BusinessDomainId Null
     */
    final public void setBusinessDomainIdNull() {
        this.businessDomainIdNull = true;
    } // end setBusinessDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBusinessDomainIdNull(boolean aNullFlag) {
        this.businessDomainIdNull = aNullFlag;
    } // end setBusinessDomainIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBusinessDomainIdNull() {
        return this.businessDomainIdNull;
    } // end isBusinessDomainIdNull()

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
     * Get ParentPackageId
     *
     * @return parentPackageId
     */
    final public Long getParentPackageId() {
        return parentPackageId;
    } // end getParentPackageId()

    /**
     * Set ParentPackageId
     *
     * @param aParentPackageId
     */
    final public void setParentPackageId(Long aParentPackageId) {
        this.parentPackageId = aParentPackageId;

        this.parentPackageIdSetted = true;

        this.setParentPackageIdNull(this.parentPackageId == null);
    } // end setParentPackageId()

    /**
     * Get ParentPackageId Has Been Setted
     *
     * @return parentPackageId
     */
    final public boolean isParentPackageIdSetted() {
        return this.parentPackageIdSetted;
    } // end isParentPackageIdSetted()

    /**
     * Set ParentPackageId Null
     */
    final public void setParentPackageIdNull() {
        this.parentPackageIdNull = true;
    } // end setParentPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentPackageIdNull(boolean aNullFlag) {
        this.parentPackageIdNull = aNullFlag;
    } // end setParentPackageIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentPackageIdNull() {
        return this.parentPackageIdNull;
    } // end isParentPackageIdNull()

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
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getBusinessPackageId() ^ (getBusinessPackageId() >>> 32));

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

        if ((obj instanceof BusinessPackage) == false) {
            return false;
        } // end if

        BusinessPackage other = (BusinessPackage) obj;

        if (other == this) {
            return true;
        } // end if

        if (getBusinessPackageId() != other.getBusinessPackageId()) {
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

        buffer.append("businessPackageId=");
        buffer.append(this.businessPackageId);
        buffer.append("\r\n");

        buffer.append("businessDomainId=");
        buffer.append(this.businessDomainId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("parentPackageId=");
        buffer.append(this.parentPackageId);
        buffer.append("\r\n");

        buffer.append("state=");
        buffer.append(this.state);
        buffer.append("\r\n");

        buffer.append("type=");
        buffer.append(this.type);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessPackage
