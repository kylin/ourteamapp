/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

/**
 * ¶ÔÏóÓ³Éä Generate Date 2011-09-22 10:16:40
 *
 * @author Auto Gen
 */
public class ObjectMapping implements java.io.Serializable {
    /**
     * Creates a new ObjectMapping object.
     */
    public ObjectMapping() {
        super();
    } // end ObjectMapping()

    /** Attribute */
    private long objectMappingId;

    /** Attribute  Be Seted Falg */
    private boolean objectMappingIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean objectMappingIdNull = false;

    /** Attribute */
    private long businessObjectId;

    /** Attribute  Be Seted Falg */
    private boolean businessObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean businessObjectIdNull = false;

    /** Attribute */
    private long persistentObjectId;

    /** Attribute  Be Seted Falg */
    private boolean persistentObjectIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean persistentObjectIdNull = false;

    /** Attribute */
    private String state;

    /** Attribute  Be Seted Falg */
    private boolean stateSetted = false;

    /** Attribute  is Null Falg */
    private boolean stateNull = false;

    /**
     * Get ObjectMappingId
     *
     * @return objectMappingId
     */
    final public long getObjectMappingId() {
        return objectMappingId;
    } // end getObjectMappingId()

    /**
     * Set ObjectMappingId
     *
     * @param aObjectMappingId
     */
    final public void setObjectMappingId(long aObjectMappingId) {
        this.objectMappingId = aObjectMappingId;

        this.objectMappingIdSetted = true;

        this.setObjectMappingIdNull(false);
    } // end setObjectMappingId()

    /**
     * Get ObjectMappingId Has Been Setted
     *
     * @return objectMappingId
     */
    final public boolean isObjectMappingIdSetted() {
        return this.objectMappingIdSetted;
    } // end isObjectMappingIdSetted()

    /**
     * Set ObjectMappingId Null
     */
    final public void setObjectMappingIdNull() {
        this.objectMappingIdNull = true;
    } // end setObjectMappingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setObjectMappingIdNull(boolean aNullFlag) {
        this.objectMappingIdNull = aNullFlag;
    } // end setObjectMappingIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isObjectMappingIdNull() {
        return this.objectMappingIdNull;
    } // end isObjectMappingIdNull()

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
     * Get PersistentObjectId
     *
     * @return persistentObjectId
     */
    final public long getPersistentObjectId() {
        return persistentObjectId;
    } // end getPersistentObjectId()

    /**
     * Set PersistentObjectId
     *
     * @param aPersistentObjectId
     */
    final public void setPersistentObjectId(long aPersistentObjectId) {
        this.persistentObjectId = aPersistentObjectId;

        this.persistentObjectIdSetted = true;

        this.setPersistentObjectIdNull(false);
    } // end setPersistentObjectId()

    /**
     * Get PersistentObjectId Has Been Setted
     *
     * @return persistentObjectId
     */
    final public boolean isPersistentObjectIdSetted() {
        return this.persistentObjectIdSetted;
    } // end isPersistentObjectIdSetted()

    /**
     * Set PersistentObjectId Null
     */
    final public void setPersistentObjectIdNull() {
        this.persistentObjectIdNull = true;
    } // end setPersistentObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPersistentObjectIdNull(boolean aNullFlag) {
        this.persistentObjectIdNull = aNullFlag;
    } // end setPersistentObjectIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPersistentObjectIdNull() {
        return this.persistentObjectIdNull;
    } // end isPersistentObjectIdNull()

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
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) +
            (int) (getObjectMappingId() ^ (getObjectMappingId() >>> 32));

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

        if ((obj instanceof ObjectMapping) == false) {
            return false;
        } // end if

        ObjectMapping other = (ObjectMapping) obj;

        if (other == this) {
            return true;
        } // end if

        if (getObjectMappingId() != other.getObjectMappingId()) {
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

        buffer.append("objectMappingId=");
        buffer.append(this.objectMappingId);
        buffer.append("\r\n");

        buffer.append("businessObjectId=");
        buffer.append(this.businessObjectId);
        buffer.append("\r\n");

        buffer.append("persistentObjectId=");
        buffer.append(this.persistentObjectId);
        buffer.append("\r\n");

        buffer.append("state=");
        buffer.append(this.state);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end ObjectMapping
