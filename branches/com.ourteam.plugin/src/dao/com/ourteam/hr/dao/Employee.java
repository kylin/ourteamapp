/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

/**
 * Generate Date 2011-10-31 11:55:27
 *
 * @author Auto Gen
 */
public class Employee implements java.io.Serializable {
    /**
     * Creates a new Employee object.
     */
    public Employee() {
        super();
    } // end Employee()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private java.util.Date birthDay;

    /** Attribute  Be Seted Falg */
    private boolean birthDaySetted = false;

    /** Attribute  is Null Falg */
    private boolean birthDayNull = false;

    /** Attribute */
    private String homeAddress;

    /** Attribute  Be Seted Falg */
    private boolean homeAddressSetted = false;

    /** Attribute  is Null Falg */
    private boolean homeAddressNull = false;

    /** Attribute */
    private String mailAddress;

    /** Attribute  Be Seted Falg */
    private boolean mailAddressSetted = false;

    /** Attribute  is Null Falg */
    private boolean mailAddressNull = false;

    /** Attribute */
    private String name;

    /** Attribute  Be Seted Falg */
    private boolean nameSetted = false;

    /** Attribute  is Null Falg */
    private boolean nameNull = false;

    /** Attribute */
    private String phoneCall;

    /** Attribute  Be Seted Falg */
    private boolean phoneCallSetted = false;

    /** Attribute  is Null Falg */
    private boolean phoneCallNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private String sex;

    /** Attribute  Be Seted Falg */
    private boolean sexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sexNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private long userId;

    /** Attribute  Be Seted Falg */
    private boolean userIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean userIdNull = false;

    /** Attribute */
    private String code;

    /** Attribute  Be Seted Falg */
    private boolean codeSetted = false;

    /** Attribute  is Null Falg */
    private boolean codeNull = false;

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
     * Get BirthDay
     *
     * @return birthDay
     */
    final public java.util.Date getBirthDay() {
        return birthDay;
    } // end getBirthDay()

    /**
     * Set BirthDay
     *
     * @param aBirthDay
     */
    final public void setBirthDay(java.util.Date aBirthDay) {
        this.birthDay = aBirthDay;

        this.birthDaySetted = true;

        this.setBirthDayNull(this.birthDay == null);
    } // end setBirthDay()

    /**
     * Get BirthDay Has Been Setted
     *
     * @return birthDay
     */
    final public boolean isBirthDaySetted() {
        return this.birthDaySetted;
    } // end isBirthDaySetted()

    /**
     * Set BirthDay Null
     */
    final public void setBirthDayNull() {
        this.birthDayNull = true;
    } // end setBirthDayNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setBirthDayNull(boolean aNullFlag) {
        this.birthDayNull = aNullFlag;
    } // end setBirthDayNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isBirthDayNull() {
        return this.birthDayNull;
    } // end isBirthDayNull()

    /**
     * Get HomeAddress
     *
     * @return homeAddress
     */
    final public String getHomeAddress() {
        return homeAddress;
    } // end getHomeAddress()

    /**
     * Set HomeAddress
     *
     * @param aHomeAddress
     */
    final public void setHomeAddress(String aHomeAddress) {
        this.homeAddress = aHomeAddress;

        this.homeAddressSetted = true;

        this.setHomeAddressNull(this.homeAddress == null);
    } // end setHomeAddress()

    /**
     * Get HomeAddress Has Been Setted
     *
     * @return homeAddress
     */
    final public boolean isHomeAddressSetted() {
        return this.homeAddressSetted;
    } // end isHomeAddressSetted()

    /**
     * Set HomeAddress Null
     */
    final public void setHomeAddressNull() {
        this.homeAddressNull = true;
    } // end setHomeAddressNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setHomeAddressNull(boolean aNullFlag) {
        this.homeAddressNull = aNullFlag;
    } // end setHomeAddressNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isHomeAddressNull() {
        return this.homeAddressNull;
    } // end isHomeAddressNull()

    /**
     * Get MailAddress
     *
     * @return mailAddress
     */
    final public String getMailAddress() {
        return mailAddress;
    } // end getMailAddress()

    /**
     * Set MailAddress
     *
     * @param aMailAddress
     */
    final public void setMailAddress(String aMailAddress) {
        this.mailAddress = aMailAddress;

        this.mailAddressSetted = true;

        this.setMailAddressNull(this.mailAddress == null);
    } // end setMailAddress()

    /**
     * Get MailAddress Has Been Setted
     *
     * @return mailAddress
     */
    final public boolean isMailAddressSetted() {
        return this.mailAddressSetted;
    } // end isMailAddressSetted()

    /**
     * Set MailAddress Null
     */
    final public void setMailAddressNull() {
        this.mailAddressNull = true;
    } // end setMailAddressNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setMailAddressNull(boolean aNullFlag) {
        this.mailAddressNull = aNullFlag;
    } // end setMailAddressNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isMailAddressNull() {
        return this.mailAddressNull;
    } // end isMailAddressNull()

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
     * Get PhoneCall
     *
     * @return phoneCall
     */
    final public String getPhoneCall() {
        return phoneCall;
    } // end getPhoneCall()

    /**
     * Set PhoneCall
     *
     * @param aPhoneCall
     */
    final public void setPhoneCall(String aPhoneCall) {
        this.phoneCall = aPhoneCall;

        this.phoneCallSetted = true;

        this.setPhoneCallNull(this.phoneCall == null);
    } // end setPhoneCall()

    /**
     * Get PhoneCall Has Been Setted
     *
     * @return phoneCall
     */
    final public boolean isPhoneCallSetted() {
        return this.phoneCallSetted;
    } // end isPhoneCallSetted()

    /**
     * Set PhoneCall Null
     */
    final public void setPhoneCallNull() {
        this.phoneCallNull = true;
    } // end setPhoneCallNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setPhoneCallNull(boolean aNullFlag) {
        this.phoneCallNull = aNullFlag;
    } // end setPhoneCallNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isPhoneCallNull() {
        return this.phoneCallNull;
    } // end isPhoneCallNull()

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
     * Get Sex
     *
     * @return sex
     */
    final public String getSex() {
        return sex;
    } // end getSex()

    /**
     * Set Sex
     *
     * @param aSex
     */
    final public void setSex(String aSex) {
        this.sex = aSex;

        this.sexSetted = true;

        this.setSexNull(this.sex == null);
    } // end setSex()

    /**
     * Get Sex Has Been Setted
     *
     * @return sex
     */
    final public boolean isSexSetted() {
        return this.sexSetted;
    } // end isSexSetted()

    /**
     * Set Sex Null
     */
    final public void setSexNull() {
        this.sexNull = true;
    } // end setSexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSexNull(boolean aNullFlag) {
        this.sexNull = aNullFlag;
    } // end setSexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSexNull() {
        return this.sexNull;
    } // end isSexNull()

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
     * Get UserId
     *
     * @return userId
     */
    final public long getUserId() {
        return userId;
    } // end getUserId()

    /**
     * Set UserId
     *
     * @param aUserId
     */
    final public void setUserId(long aUserId) {
        this.userId = aUserId;

        this.userIdSetted = true;

        this.setUserIdNull(false);
    } // end setUserId()

    /**
     * Get UserId Has Been Setted
     *
     * @return userId
     */
    final public boolean isUserIdSetted() {
        return this.userIdSetted;
    } // end isUserIdSetted()

    /**
     * Set UserId Null
     */
    final public void setUserIdNull() {
        this.userIdNull = true;
    } // end setUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setUserIdNull(boolean aNullFlag) {
        this.userIdNull = aNullFlag;
    } // end setUserIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isUserIdNull() {
        return this.userIdNull;
    } // end isUserIdNull()

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

        if ((obj instanceof Employee) == false) {
            return false;
        } // end if

        Employee other = (Employee) obj;

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

        buffer.append("birthDay=");
        buffer.append(this.birthDay);
        buffer.append("\r\n");

        buffer.append("homeAddress=");
        buffer.append(this.homeAddress);
        buffer.append("\r\n");

        buffer.append("mailAddress=");
        buffer.append(this.mailAddress);
        buffer.append("\r\n");

        buffer.append("name=");
        buffer.append(this.name);
        buffer.append("\r\n");

        buffer.append("phoneCall=");
        buffer.append(this.phoneCall);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sex=");
        buffer.append(this.sex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("userId=");
        buffer.append(this.userId);
        buffer.append("\r\n");

        buffer.append("code=");
        buffer.append(this.code);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end Employee
