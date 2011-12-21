/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * 系统用户密码 Generate Date 2011-09-22 10:11:25
 *
 * @author Auto Gen
 */
public class SysUserPassword implements java.io.Serializable {
    /**
     * Creates a new SysUserPassword object.
     */
    public SysUserPassword() {
        super();
    } // end SysUserPassword()

    /** Attribute */
    private String userName;

    /** Attribute  Be Seted Falg */
    private boolean userNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean userNameNull = false;

    /** Attribute */
    private String enabled;

    /** Attribute  Be Seted Falg */
    private boolean enabledSetted = false;

    /** Attribute  is Null Falg */
    private boolean enabledNull = false;

    /** Attribute */
    private String password;

    /** Attribute  Be Seted Falg */
    private boolean passwordSetted = false;

    /** Attribute  is Null Falg */
    private boolean passwordNull = false;

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
     * Get Enabled
     *
     * @return enabled
     */
    final public String getEnabled() {
        return enabled;
    } // end getEnabled()

    /**
     * Set Enabled
     *
     * @param aEnabled
     */
    final public void setEnabled(String aEnabled) {
        this.enabled = aEnabled;

        this.enabledSetted = true;

        this.setEnabledNull(this.enabled == null);
    } // end setEnabled()

    /**
     * Get Enabled Has Been Setted
     *
     * @return enabled
     */
    final public boolean isEnabledSetted() {
        return this.enabledSetted;
    } // end isEnabledSetted()

    /**
     * Set Enabled Null
     */
    final public void setEnabledNull() {
        this.enabledNull = true;
    } // end setEnabledNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setEnabledNull(boolean aNullFlag) {
        this.enabledNull = aNullFlag;
    } // end setEnabledNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isEnabledNull() {
        return this.enabledNull;
    } // end isEnabledNull()

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

        result = (prime * result) +
            ((getUserName() == null) ? 0 : getUserName().hashCode());

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

        if ((obj instanceof SysUserPassword) == false) {
            return false;
        } // end if

        SysUserPassword other = (SysUserPassword) obj;

        if (other == this) {
            return true;
        } // end if

        if (getUserName() == null) {
            if (other.getUserName() != null) {
                return false;
            } // end if
        } // end if
        else if (getUserName().equals(other.getUserName()) == false) {
            return false;
        } // end else if

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

        buffer.append("userName=");
        buffer.append(this.userName);
        buffer.append("\r\n");

        buffer.append("enabled=");
        buffer.append(this.enabled);
        buffer.append("\r\n");

        buffer.append("password=");
        buffer.append(this.password);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysUserPassword
