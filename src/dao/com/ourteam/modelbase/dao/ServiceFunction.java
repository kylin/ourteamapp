/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * 服务功能定义 Generate Date 2011-09-22 10:16:50
 *
 * @author Auto Gen
 */
public class ServiceFunction implements java.io.Serializable {
    /**
     * Creates a new ServiceFunction object.
     */
    public ServiceFunction() {
        super();
    } // end ServiceFunction()

    /** Attribute */
    private long objectFunctionId;

    /** Attribute  Be Seted Falg */
    private boolean objectFunctionIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectFunctionIdNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private String isQuery;

    /** Attribute  Be Seted Falg */
    private boolean isQuerySetted = false;

    /** Attribute  is Null Falg */
    private boolean isQueryNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private long objectId;

    /** Attribute  Be Seted Falg */
    private boolean objectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectIdNull = false;

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
     * Get ObjectFunctionId
     *
     * @return objectFunctionId
     */
    final public long getObjectFunctionId() {
        return objectFunctionId;
    } // end getObjectFunctionId()

    /**
     * Set ObjectFunctionId
     *
     * @param aObjectFunctionId
     */
    final public void setObjectFunctionId(long aObjectFunctionId) {
        this.objectFunctionId = aObjectFunctionId;

        this.objectFunctionIdSetted = true;

        this.setObjectFunctionIdNull(false);
    } // end setObjectFunctionId()

    /**
     * Get ObjectFunctionId Has Been Setted
     *
     * @return objectFunctionId
     */
    final public boolean isObjectFunctionIdSetted() {
        return this.objectFunctionIdSetted;
    } // end isObjectFunctionIdSetted()

    /**
     * Set ObjectFunctionId Null
     */
    final public void setObjectFunctionIdNull() {
        this.objectFunctionIdNull = true;
    } // end setObjectFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectFunctionIdNull(boolean aNullFlag) {
        this.objectFunctionIdNull = aNullFlag;
    } // end setObjectFunctionIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectFunctionIdNull() {
        return this.objectFunctionIdNull;
    } // end isObjectFunctionIdNull()

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
     * Get IsQuery
     *
     * @return isQuery
     */
    final public String getIsQuery() {
        return isQuery;
    } // end getIsQuery()

    /**
     * Set IsQuery
     *
     * @param aIsQuery
     */
    final public void setIsQuery(String aIsQuery) {
        this.isQuery = aIsQuery;

        this.isQuerySetted = true;

        this.setIsQueryNull(this.isQuery == null);
    } // end setIsQuery()

    /**
     * Get IsQuery Has Been Setted
     *
     * @return isQuery
     */
    final public boolean isIsQuerySetted() {
        return this.isQuerySetted;
    } // end isIsQuerySetted()

    /**
     * Set IsQuery Null
     */
    final public void setIsQueryNull() {
        this.isQueryNull = true;
    } // end setIsQueryNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIsQueryNull(boolean aNullFlag) {
        this.isQueryNull = aNullFlag;
    } // end setIsQueryNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIsQueryNull() {
        return this.isQueryNull;
    } // end isIsQueryNull()

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
            (int) (getObjectFunctionId() ^ (getObjectFunctionId() >>> 32));

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

        if ((obj instanceof ServiceFunction) == false) {
            return false;
        } // end if

        ServiceFunction other = (ServiceFunction) obj;

        if (other == this) {
            return true;
        } // end if

        if (getObjectFunctionId() != other.getObjectFunctionId()) {
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

        buffer.append("objectFunctionId=");
        buffer.append(this.objectFunctionId);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("isQuery=");
        buffer.append(this.isQuery);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("objectId=");
        buffer.append(this.objectId);
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
} // end ServiceFunction
