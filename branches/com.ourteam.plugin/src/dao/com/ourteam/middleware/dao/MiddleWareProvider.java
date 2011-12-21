/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

/**
 * Generate Date 2011-12-06 11:42:55
 *
 * @author Auto Gen
 */
public class MiddleWareProvider implements java.io.Serializable {
    /**
     * Creates a new MiddleWareProvider object.
     */
    public MiddleWareProvider() {
        super();
    } // end MiddleWareProvider()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String driverType;

    /** Attribute  Be Seted Falg */
    private boolean driverTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean driverTypeNull = false;

    /** Attribute */
    private String middleWareName;

    /** Attribute  Be Seted Falg */
    private boolean middleWareNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareNameNull = false;

    /** Attribute */
    private String middleWareType;

    /** Attribute  Be Seted Falg */
    private boolean middleWareTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareTypeNull = false;

    /** Attribute */
    private String middleWareVersion;

    /** Attribute  Be Seted Falg */
    private boolean middleWareVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean middleWareVersionNull = false;

    /** Attribute */
    private String providerName;

    /** Attribute  Be Seted Falg */
    private boolean providerNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean providerNameNull = false;

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
     * Get DriverType
     *
     * @return driverType
     */
    final public String getDriverType() {
        if (isDriverTypeNull()) {
            return null;
        } // end if
        else {
            return driverType;
        } // end else
    } // end getDriverType()

    /**
     * Set DriverType
     *
     * @param aDriverType
     */
    final public void setDriverType(String aDriverType) {
        this.driverType = aDriverType;

        this.driverTypeSetted = true;

        this.setDriverTypeNull(this.driverType == null);
    } // end setDriverType()

    /**
     * Get DriverType Has Been Setted
     *
     * @return driverType
     */
    final public boolean isDriverTypeSetted() {
        return this.driverTypeSetted;
    } // end isDriverTypeSetted()

    /**
     * Set DriverType Null
     */
    final public void setDriverTypeNull() {
        this.driverTypeNull = true;
    } // end setDriverTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDriverTypeNull(boolean aNullFlag) {
        this.driverTypeNull = aNullFlag;
    } // end setDriverTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDriverTypeNull() {
        return this.driverTypeNull;
    } // end isDriverTypeNull()

    /**
     * Get MiddleWareName
     *
     * @return middleWareName
     */
    final public String getMiddleWareName() {
        if (isMiddleWareNameNull()) {
            return null;
        } // end if
        else {
            return middleWareName;
        } // end else
    } // end getMiddleWareName()

    /**
     * Set MiddleWareName
     *
     * @param aMiddleWareName
     */
    final public void setMiddleWareName(String aMiddleWareName) {
        this.middleWareName = aMiddleWareName;

        this.middleWareNameSetted = true;

        this.setMiddleWareNameNull(this.middleWareName == null);
    } // end setMiddleWareName()

    /**
     * Get MiddleWareName Has Been Setted
     *
     * @return middleWareName
     */
    final public boolean isMiddleWareNameSetted() {
        return this.middleWareNameSetted;
    } // end isMiddleWareNameSetted()

    /**
     * Set MiddleWareName Null
     */
    final public void setMiddleWareNameNull() {
        this.middleWareNameNull = true;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareNameNull(boolean aNullFlag) {
        this.middleWareNameNull = aNullFlag;
    } // end setMiddleWareNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareNameNull() {
        return this.middleWareNameNull;
    } // end isMiddleWareNameNull()

    /**
     * Get MiddleWareType
     *
     * @return middleWareType
     */
    final public String getMiddleWareType() {
        return middleWareType;
    } // end getMiddleWareType()

    /**
     * Set MiddleWareType
     *
     * @param aMiddleWareType
     */
    final public void setMiddleWareType(String aMiddleWareType) {
        this.middleWareType = aMiddleWareType;

        this.middleWareTypeSetted = true;

        this.setMiddleWareTypeNull(this.middleWareType == null);
    } // end setMiddleWareType()

    /**
     * Get MiddleWareType Has Been Setted
     *
     * @return middleWareType
     */
    final public boolean isMiddleWareTypeSetted() {
        return this.middleWareTypeSetted;
    } // end isMiddleWareTypeSetted()

    /**
     * Set MiddleWareType Null
     */
    final public void setMiddleWareTypeNull() {
        this.middleWareTypeNull = true;
    } // end setMiddleWareTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareTypeNull(boolean aNullFlag) {
        this.middleWareTypeNull = aNullFlag;
    } // end setMiddleWareTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareTypeNull() {
        return this.middleWareTypeNull;
    } // end isMiddleWareTypeNull()

    /**
     * Get MiddleWareVersion
     *
     * @return middleWareVersion
     */
    final public String getMiddleWareVersion() {
        if (isMiddleWareVersionNull()) {
            return null;
        } // end if
        else {
            return middleWareVersion;
        } // end else
    } // end getMiddleWareVersion()

    /**
     * Set MiddleWareVersion
     *
     * @param aMiddleWareVersion
     */
    final public void setMiddleWareVersion(String aMiddleWareVersion) {
        this.middleWareVersion = aMiddleWareVersion;

        this.middleWareVersionSetted = true;

        this.setMiddleWareVersionNull(this.middleWareVersion == null);
    } // end setMiddleWareVersion()

    /**
     * Get MiddleWareVersion Has Been Setted
     *
     * @return middleWareVersion
     */
    final public boolean isMiddleWareVersionSetted() {
        return this.middleWareVersionSetted;
    } // end isMiddleWareVersionSetted()

    /**
     * Set MiddleWareVersion Null
     */
    final public void setMiddleWareVersionNull() {
        this.middleWareVersionNull = true;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMiddleWareVersionNull(boolean aNullFlag) {
        this.middleWareVersionNull = aNullFlag;
    } // end setMiddleWareVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMiddleWareVersionNull() {
        return this.middleWareVersionNull;
    } // end isMiddleWareVersionNull()

    /**
     * Get ProviderName
     *
     * @return providerName
     */
    final public String getProviderName() {
        if (isProviderNameNull()) {
            return null;
        } // end if
        else {
            return providerName;
        } // end else
    } // end getProviderName()

    /**
     * Set ProviderName
     *
     * @param aProviderName
     */
    final public void setProviderName(String aProviderName) {
        this.providerName = aProviderName;

        this.providerNameSetted = true;

        this.setProviderNameNull(this.providerName == null);
    } // end setProviderName()

    /**
     * Get ProviderName Has Been Setted
     *
     * @return providerName
     */
    final public boolean isProviderNameSetted() {
        return this.providerNameSetted;
    } // end isProviderNameSetted()

    /**
     * Set ProviderName Null
     */
    final public void setProviderNameNull() {
        this.providerNameNull = true;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setProviderNameNull(boolean aNullFlag) {
        this.providerNameNull = aNullFlag;
    } // end setProviderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isProviderNameNull() {
        return this.providerNameNull;
    } // end isProviderNameNull()

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

        if ((obj instanceof MiddleWareProvider) == false) {
            return false;
        } // end if

        MiddleWareProvider other = (MiddleWareProvider) obj;

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

        buffer.append("driverType=");
        buffer.append(this.driverType);
        buffer.append("\r\n");

        buffer.append("middleWareName=");
        buffer.append(this.middleWareName);
        buffer.append("\r\n");

        buffer.append("middleWareType=");
        buffer.append(this.middleWareType);
        buffer.append("\r\n");

        buffer.append("middleWareVersion=");
        buffer.append(this.middleWareVersion);
        buffer.append("\r\n");

        buffer.append("providerName=");
        buffer.append(this.providerName);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end MiddleWareProvider
