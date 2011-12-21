/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * ÒµÎñÁìÓò Generate Date 2011-09-22 10:16:34
 *
 * @author Auto Gen
 */
public class BusinessDomain implements java.io.Serializable {
    /**
     * Creates a new BusinessDomain object.
     */
    public BusinessDomain() {
        super();
    } // end BusinessDomain()

    /** Attribute */
    private long businessDomainId;

    /** Attribute  Be Seted Falg */
    private boolean businessDomainIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessDomainIdNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

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
     * Get Code
     *
     * @return code
     */
    final public String getCode() {
        return code;
    } // end getCode()

    /**
     * Set Code
     *
     * @param aCode
     */
    final public void setCode(String aCode) {
        this.code = aCode;

        this.codeSetted = true;

        this.setCodeNull(this.code == null);
    } // end setCode()

    /**
     * Get Code Has Been Setted
     *
     * @return code
     */
    final public boolean isCodeSetted() {
        return this.codeSetted;
    } // end isCodeSetted()

    /**
     * Set Code Null
     */
    final public void setCodeNull() {
        this.codeNull = true;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setCodeNull(boolean aNullFlag) {
        this.codeNull = aNullFlag;
    } // end setCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isCodeNull() {
        return this.codeNull;
    } // end isCodeNull()

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
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getBusinessDomainId() ^ (getBusinessDomainId() >>> 32));

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

        if ((obj instanceof BusinessDomain) == false) {
            return false;
        } // end if

        BusinessDomain other = (BusinessDomain) obj;

        if (other == this) {
            return true;
        } // end if

        if (getBusinessDomainId() != other.getBusinessDomainId()) {
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

        buffer.append("businessDomainId=");
        buffer.append(this.businessDomainId);
        buffer.append("\r\n");

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end BusinessDomain
