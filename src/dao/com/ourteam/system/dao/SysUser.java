/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统用户 Generate Date 2011-11-07 09:51:14
 *
 * @author Auto Gen
 */
public class SysUser implements java.io.Serializable {
    /**
     * Creates a new SysUser object.
     */
    public SysUser() {
        super();
    } // end SysUser()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String userAccount;

    /** Attribute  Be Seted Falg */
    private boolean userAccountSetted = false;

    /** Attribute  is Null Falg */
    private boolean userAccountNull = false;

    /** Attribute */
    private String userName;

    /** Attribute  Be Seted Falg */
    private boolean userNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean userNameNull = false;

    /** Attribute */
    private String userType;

    /** Attribute  Be Seted Falg */
    private boolean userTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean userTypeNull = false;

    /** Attribute */
    private String password;

    /** Attribute  Be Seted Falg */
    private boolean passwordSetted = false;

    /** Attribute  is Null Falg */
    private boolean passwordNull = false;

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
     * Get Remarks
     *
     * @return remarks
     */
    final public String getRemarks() {
        if (isRemarksNull()) {
            return null;
        } // end if
        else {
            return remarks;
        } // end else
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    final public void setRemarks(String aRemarks) {
        this.remarks = aRemarks;

        this.remarksSetted = true;

        this.setRemarksNull(this.remarks == null);
    } // end setRemarks()

    /**
     * Get Remarks Has Been Setted
     *
     * @return remarks
     */
    final public boolean isRemarksSetted() {
        return this.remarksSetted;
    } // end isRemarksSetted()

    /**
     * Set Remarks Null
     */
    final public void setRemarksNull() {
        this.remarksNull = true;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setRemarksNull(boolean aNullFlag) {
        this.remarksNull = aNullFlag;
    } // end setRemarksNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isRemarksNull() {
        return this.remarksNull;
    } // end isRemarksNull()

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
     * Get UserAccount
     *
     * @return userAccount
     */
    final public String getUserAccount() {
        return userAccount;
    } // end getUserAccount()

    /**
     * Set UserAccount
     *
     * @param aUserAccount
     */
    final public void setUserAccount(String aUserAccount) {
        this.userAccount = aUserAccount;

        this.userAccountSetted = true;

        this.setUserAccountNull(this.userAccount == null);
    } // end setUserAccount()

    /**
     * Get UserAccount Has Been Setted
     *
     * @return userAccount
     */
    final public boolean isUserAccountSetted() {
        return this.userAccountSetted;
    } // end isUserAccountSetted()

    /**
     * Set UserAccount Null
     */
    final public void setUserAccountNull() {
        this.userAccountNull = true;
    } // end setUserAccountNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserAccountNull(boolean aNullFlag) {
        this.userAccountNull = aNullFlag;
    } // end setUserAccountNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserAccountNull() {
        return this.userAccountNull;
    } // end isUserAccountNull()

    /**
     * Get UserName
     *
     * @return userName
     */
    final public String getUserName() {
        return userName;
    } // end getUserName()

    /**
     * Set UserName
     *
     * @param aUserName
     */
    final public void setUserName(String aUserName) {
        this.userName = aUserName;

        this.userNameSetted = true;

        this.setUserNameNull(this.userName == null);
    } // end setUserName()

    /**
     * Get UserName Has Been Setted
     *
     * @return userName
     */
    final public boolean isUserNameSetted() {
        return this.userNameSetted;
    } // end isUserNameSetted()

    /**
     * Set UserName Null
     */
    final public void setUserNameNull() {
        this.userNameNull = true;
    } // end setUserNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserNameNull(boolean aNullFlag) {
        this.userNameNull = aNullFlag;
    } // end setUserNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserNameNull() {
        return this.userNameNull;
    } // end isUserNameNull()

    /**
     * Get UserType
     *
     * @return userType
     */
    final public String getUserType() {
        return userType;
    } // end getUserType()

    /**
     * Set UserType
     *
     * @param aUserType
     */
    final public void setUserType(String aUserType) {
        this.userType = aUserType;

        this.userTypeSetted = true;

        this.setUserTypeNull(this.userType == null);
    } // end setUserType()

    /**
     * Get UserType Has Been Setted
     *
     * @return userType
     */
    final public boolean isUserTypeSetted() {
        return this.userTypeSetted;
    } // end isUserTypeSetted()

    /**
     * Set UserType Null
     */
    final public void setUserTypeNull() {
        this.userTypeNull = true;
    } // end setUserTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserTypeNull(boolean aNullFlag) {
        this.userTypeNull = aNullFlag;
    } // end setUserTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserTypeNull() {
        return this.userTypeNull;
    } // end isUserTypeNull()

    /**
     * Get Password
     *
     * @return password
     */
    final public String getPassword() {
        return password;
    } // end getPassword()

    /**
     * Set Password
     *
     * @param aPassword
     */
    final public void setPassword(String aPassword) {
        this.password = aPassword;

        this.passwordSetted = true;

        this.setPasswordNull(this.password == null);
    } // end setPassword()

    /**
     * Get Password Has Been Setted
     *
     * @return password
     */
    final public boolean isPasswordSetted() {
        return this.passwordSetted;
    } // end isPasswordSetted()

    /**
     * Set Password Null
     */
    final public void setPasswordNull() {
        this.passwordNull = true;
    } // end setPasswordNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPasswordNull(boolean aNullFlag) {
        this.passwordNull = aNullFlag;
    } // end setPasswordNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPasswordNull() {
        return this.passwordNull;
    } // end isPasswordNull()

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

        if ((obj instanceof SysUser) == false) {
            return false;
        } // end if

        SysUser other = (SysUser) obj;

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

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("userAccount=");
        buffer.append(this.userAccount);
        buffer.append("\r\n");

        buffer.append("userName=");
        buffer.append(this.userName);
        buffer.append("\r\n");

        buffer.append("userType=");
        buffer.append(this.userType);
        buffer.append("\r\n");

        buffer.append("password=");
        buffer.append(this.password);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysUser
