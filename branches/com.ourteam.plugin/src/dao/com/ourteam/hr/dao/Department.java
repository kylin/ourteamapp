/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

/**
 * Generate Date 2011-10-28 17:10:31
 *
 * @author Auto Gen
 */
public class Department implements java.io.Serializable {
    /**
     * Creates a new Department object.
     */
    public Department() {
        super();
    } // end Department()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String departmentName;

    /** Attribute  Be Seted Falg */
    private boolean departmentNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean departmentNameNull = false;

    /** Attribute */
    private String description;

    /** Attribute  Be Seted Falg */
    private boolean descriptionSetted = false;

    /** Attribute  is Null Falg */
    private boolean descriptionNull = false;

    /** Attribute */
    private long parentId;

    /** Attribute  Be Seted Falg */
    private boolean parentIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentIdNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /**
     * Get Id
     *
     * @return id
     */
    final public long getId() {
        return id;
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    final public void setId(long aId) {
        this.id = aId;

        this.idSetted = true;

        this.setIdNull(false);
    } // end setId()

    /**
     * Get Id Has Been Setted
     *
     * @return id
     */
    final public boolean isIdSetted() {
        return this.idSetted;
    } // end isIdSetted()

    /**
     * Set Id Null
     */
    final public void setIdNull() {
        this.idNull = true;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setIdNull(boolean aNullFlag) {
        this.idNull = aNullFlag;
    } // end setIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isIdNull() {
        return this.idNull;
    } // end isIdNull()

    /**
     * Get DepartmentName
     *
     * @return departmentName
     */
    final public String getDepartmentName() {
        return departmentName;
    } // end getDepartmentName()

    /**
     * Set DepartmentName
     *
     * @param aDepartmentName
     */
    final public void setDepartmentName(String aDepartmentName) {
        this.departmentName = aDepartmentName;

        this.departmentNameSetted = true;

        this.setDepartmentNameNull(this.departmentName == null);
    } // end setDepartmentName()

    /**
     * Get DepartmentName Has Been Setted
     *
     * @return departmentName
     */
    final public boolean isDepartmentNameSetted() {
        return this.departmentNameSetted;
    } // end isDepartmentNameSetted()

    /**
     * Set DepartmentName Null
     */
    final public void setDepartmentNameNull() {
        this.departmentNameNull = true;
    } // end setDepartmentNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDepartmentNameNull(boolean aNullFlag) {
        this.departmentNameNull = aNullFlag;
    } // end setDepartmentNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDepartmentNameNull() {
        return this.departmentNameNull;
    } // end isDepartmentNameNull()

    /**
     * Get Description
     *
     * @return description
     */
    final public String getDescription() {
        if (isDescriptionNull()) {
            return null;
        } // end if
        else {
            return description;
        } // end else
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
     * Get ParentId
     *
     * @return parentId
     */
    final public long getParentId() {
        return parentId;
    } // end getParentId()

    /**
     * Set ParentId
     *
     * @param aParentId
     */
    final public void setParentId(long aParentId) {
        this.parentId = aParentId;

        this.parentIdSetted = true;

        this.setParentIdNull(false);
    } // end setParentId()

    /**
     * Get ParentId Has Been Setted
     *
     * @return parentId
     */
    final public boolean isParentIdSetted() {
        return this.parentIdSetted;
    } // end isParentIdSetted()

    /**
     * Set ParentId Null
     */
    final public void setParentIdNull() {
        this.parentIdNull = true;
    } // end setParentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentIdNull(boolean aNullFlag) {
        this.parentIdNull = aNullFlag;
    } // end setParentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentIdNull() {
        return this.parentIdNull;
    } // end isParentIdNull()

    /**
     * Get Status
     *
     * @return status
     */
    final public String getStatus() {
        return status;
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    final public void setStatus(String aStatus) {
        this.status = aStatus;

        this.statusSetted = true;

        this.setStatusNull(this.status == null);
    } // end setStatus()

    /**
     * Get Status Has Been Setted
     *
     * @return status
     */
    final public boolean isStatusSetted() {
        return this.statusSetted;
    } // end isStatusSetted()

    /**
     * Set Status Null
     */
    final public void setStatusNull() {
        this.statusNull = true;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setStatusNull(boolean aNullFlag) {
        this.statusNull = aNullFlag;
    } // end setStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isStatusNull() {
        return this.statusNull;
    } // end isStatusNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (prime * result) + (int) (getId() ^ (getId() >>> 32));

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

        if ((obj instanceof Department) == false) {
            return false;
        } // end if

        Department other = (Department) obj;

        if (other == this) {
            return true;
        } // end if

        if (getId() != other.getId()) {
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

        buffer.append("id=");
        buffer.append(this.id);
        buffer.append("\r\n");

        buffer.append("departmentName=");
        buffer.append(this.departmentName);
        buffer.append("\r\n");

        buffer.append("description=");
        buffer.append(this.description);
        buffer.append("\r\n");

        buffer.append("parentId=");
        buffer.append(this.parentId);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end Department
