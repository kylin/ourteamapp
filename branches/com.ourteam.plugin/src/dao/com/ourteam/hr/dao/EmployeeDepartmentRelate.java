/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

/**
 * Generate Date 2011-11-29 20:18:38
 *
 * @author Auto Gen
 */
public class EmployeeDepartmentRelate implements java.io.Serializable {
    /**
     * Creates a new EmployeeDepartmentRelate object.
     */
    public EmployeeDepartmentRelate() {
        super();
    } // end EmployeeDepartmentRelate()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String departmentRole;

    /** Attribute  Be Seted Falg */
    private boolean departmentRoleSetted = false;

    /** Attribute  is Null Falg */
    private boolean departmentRoleNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long departmentId;

    /** Attribute  Be Seted Falg */
    private boolean departmentIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean departmentIdNull = false;

    /** Attribute */
    private long employeeId;

    /** Attribute  Be Seted Falg */
    private boolean employeeIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeIdNull = false;

    /** Attribute */
    private String employeeName;

    /** Attribute  Be Seted Falg */
    private boolean employeeNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean employeeNameNull = false;

    /** Attribute */
    private String departmentName;

    /** Attribute  Be Seted Falg */
    private boolean departmentNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean departmentNameNull = false;

    /** Attribute */
    private long parentDepartmentId;

    /** Attribute  Be Seted Falg */
    private boolean parentDepartmentIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentDepartmentIdNull = false;

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
     * Get DepartmentRole
     *
     * @return departmentRole
     */
    final public String getDepartmentRole() {
        return departmentRole;
    } // end getDepartmentRole()

    /**
     * Set DepartmentRole
     *
     * @param aDepartmentRole
     */
    final public void setDepartmentRole(String aDepartmentRole) {
        this.departmentRole = aDepartmentRole;

        this.departmentRoleSetted = true;

        this.setDepartmentRoleNull(this.departmentRole == null);
    } // end setDepartmentRole()

    /**
     * Get DepartmentRole Has Been Setted
     *
     * @return departmentRole
     */
    final public boolean isDepartmentRoleSetted() {
        return this.departmentRoleSetted;
    } // end isDepartmentRoleSetted()

    /**
     * Set DepartmentRole Null
     */
    final public void setDepartmentRoleNull() {
        this.departmentRoleNull = true;
    } // end setDepartmentRoleNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDepartmentRoleNull(boolean aNullFlag) {
        this.departmentRoleNull = aNullFlag;
    } // end setDepartmentRoleNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDepartmentRoleNull() {
        return this.departmentRoleNull;
    } // end isDepartmentRoleNull()

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
     * Get DepartmentId
     *
     * @return departmentId
     */
    final public long getDepartmentId() {
        return departmentId;
    } // end getDepartmentId()

    /**
     * Set DepartmentId
     *
     * @param aDepartmentId
     */
    final public void setDepartmentId(long aDepartmentId) {
        this.departmentId = aDepartmentId;

        this.departmentIdSetted = true;

        this.setDepartmentIdNull(false);
    } // end setDepartmentId()

    /**
     * Get DepartmentId Has Been Setted
     *
     * @return departmentId
     */
    final public boolean isDepartmentIdSetted() {
        return this.departmentIdSetted;
    } // end isDepartmentIdSetted()

    /**
     * Set DepartmentId Null
     */
    final public void setDepartmentIdNull() {
        this.departmentIdNull = true;
    } // end setDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDepartmentIdNull(boolean aNullFlag) {
        this.departmentIdNull = aNullFlag;
    } // end setDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDepartmentIdNull() {
        return this.departmentIdNull;
    } // end isDepartmentIdNull()

    /**
     * Get EmployeeId
     *
     * @return employeeId
     */
    final public long getEmployeeId() {
        return employeeId;
    } // end getEmployeeId()

    /**
     * Set EmployeeId
     *
     * @param aEmployeeId
     */
    final public void setEmployeeId(long aEmployeeId) {
        this.employeeId = aEmployeeId;

        this.employeeIdSetted = true;

        this.setEmployeeIdNull(false);
    } // end setEmployeeId()

    /**
     * Get EmployeeId Has Been Setted
     *
     * @return employeeId
     */
    final public boolean isEmployeeIdSetted() {
        return this.employeeIdSetted;
    } // end isEmployeeIdSetted()

    /**
     * Set EmployeeId Null
     */
    final public void setEmployeeIdNull() {
        this.employeeIdNull = true;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeIdNull(boolean aNullFlag) {
        this.employeeIdNull = aNullFlag;
    } // end setEmployeeIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeIdNull() {
        return this.employeeIdNull;
    } // end isEmployeeIdNull()

    /**
     * Get EmployeeName
     *
     * @return employeeName
     */
    final public String getEmployeeName() {
        return employeeName;
    } // end getEmployeeName()

    /**
     * Set EmployeeName
     *
     * @param aEmployeeName
     */
    final public void setEmployeeName(String aEmployeeName) {
        this.employeeName = aEmployeeName;

        this.employeeNameSetted = true;

        this.setEmployeeNameNull(this.employeeName == null);
    } // end setEmployeeName()

    /**
     * Get EmployeeName Has Been Setted
     *
     * @return employeeName
     */
    final public boolean isEmployeeNameSetted() {
        return this.employeeNameSetted;
    } // end isEmployeeNameSetted()

    /**
     * Set EmployeeName Null
     */
    final public void setEmployeeNameNull() {
        this.employeeNameNull = true;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEmployeeNameNull(boolean aNullFlag) {
        this.employeeNameNull = aNullFlag;
    } // end setEmployeeNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEmployeeNameNull() {
        return this.employeeNameNull;
    } // end isEmployeeNameNull()

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
     * Get ParentDepartmentId
     *
     * @return parentDepartmentId
     */
    final public long getParentDepartmentId() {
        return parentDepartmentId;
    } // end getParentDepartmentId()

    /**
     * Set ParentDepartmentId
     *
     * @param aParentDepartmentId
     */
    final public void setParentDepartmentId(long aParentDepartmentId) {
        this.parentDepartmentId = aParentDepartmentId;

        this.parentDepartmentIdSetted = true;

        this.setParentDepartmentIdNull(false);
    } // end setParentDepartmentId()

    /**
     * Get ParentDepartmentId Has Been Setted
     *
     * @return parentDepartmentId
     */
    final public boolean isParentDepartmentIdSetted() {
        return this.parentDepartmentIdSetted;
    } // end isParentDepartmentIdSetted()

    /**
     * Set ParentDepartmentId Null
     */
    final public void setParentDepartmentIdNull() {
        this.parentDepartmentIdNull = true;
    } // end setParentDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentDepartmentIdNull(boolean aNullFlag) {
        this.parentDepartmentIdNull = aNullFlag;
    } // end setParentDepartmentIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentDepartmentIdNull() {
        return this.parentDepartmentIdNull;
    } // end isParentDepartmentIdNull()

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

        if ((obj instanceof EmployeeDepartmentRelate) == false) {
            return false;
        } // end if

        EmployeeDepartmentRelate other = (EmployeeDepartmentRelate) obj;

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

        buffer.append("departmentRole=");
        buffer.append(this.departmentRole);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("departmentId=");
        buffer.append(this.departmentId);
        buffer.append("\r\n");

        buffer.append("employeeId=");
        buffer.append(this.employeeId);
        buffer.append("\r\n");

        buffer.append("employeeName=");
        buffer.append(this.employeeName);
        buffer.append("\r\n");

        buffer.append("departmentName=");
        buffer.append(this.departmentName);
        buffer.append("\r\n");

        buffer.append("parentDepartmentId=");
        buffer.append(this.parentDepartmentId);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end EmployeeDepartmentRelate
