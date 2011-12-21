/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 系统用户密码 Generate date 2011-11-07 09:29:57
 *
 * @model auto gen
 */
public class SystemUserPassword implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * Creates a new SystemUserPassword object.
     */
    public SystemUserPassword() {
        super();
    } // end SystemUserPassword()

    /**
     * DOCUMENT ME!
     *
     * @param aAttrName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static String getMappedDAOField(String aAttrName) {
        return (String) mappedDaoFields.get(aAttrName);
    } // end getMappedDAOField()

    /**
     * DOCUMENT ME!
     */
    private String account;

    /**
     * DOCUMENT ME!
     */
    private String password;

    /**
     * DOCUMENT ME!
     */
    private boolean enabled;

    /**
     * Get Account 帐号
     *
     * @return account
     */
    public String getAccount() {
        return account;
    } // end getAccount()

    /**
     * Set Account 帐号
     *
     * @param aAccount
     */
    public void setAccount(String aAccount) {
        this.account = aAccount;
    } // end setAccount()

    /**
     * Get Password 密码
     *
     * @return password
     */
    public String getPassword() {
        return password;
    } // end getPassword()

    /**
     * Set Password 密码
     *
     * @param aPassword
     */
    public void setPassword(String aPassword) {
        this.password = aPassword;
    } // end setPassword()

    /**
     * Get Enabled 是否可用
     *
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    } // end isEnabled()

    /**
     * Set Enabled 是否可用
     *
     * @param aEnabled
     */
    public void setEnabled(boolean aEnabled) {
        this.enabled = aEnabled;
    } // end setEnabled()
} // end SystemUserPassword
