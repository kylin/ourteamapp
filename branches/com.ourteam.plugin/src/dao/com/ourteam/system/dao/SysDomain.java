/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

/**
 * Generate Date 2011-11-29 09:07:49
 *
 * @author Auto Gen
 */
public class SysDomain implements java.io.Serializable {
    /**
     * Creates a new SysDomain object.
     */
    public SysDomain() {
        super();
    } // end SysDomain()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String domainCode;

    /** Attribute  Be Seted Falg */
    private boolean domainCodeSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainCodeNull = false;

    /** Attribute */
    private String domainIcon;

    /** Attribute  Be Seted Falg */
    private boolean domainIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainIconNull = false;

    /** Attribute */
    private String domainName;

    /** Attribute  Be Seted Falg */
    private boolean domainNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainNameNull = false;

    /** Attribute */
    private String domainTitelKey;

    /** Attribute  Be Seted Falg */
    private boolean domainTitelKeySetted = false;

    /** Attribute  is Null Falg */
    private boolean domainTitelKeyNull = false;

    /** Attribute */
    private String remarks;

    /** Attribute  Be Seted Falg */
    private boolean remarksSetted = false;

    /** Attribute  is Null Falg */
    private boolean remarksNull = false;

    /** Attribute */
    private Integer sortIndex;

    /** Attribute  Be Seted Falg */
    private boolean sortIndexSetted = false;

    /** Attribute  is Null Falg */
    private boolean sortIndexNull = false;

    /** Attribute */
    private String status;

    /** Attribute  Be Seted Falg */
    private boolean statusSetted = false;

    /** Attribute  is Null Falg */
    private boolean statusNull = false;

    /** Attribute */
    private String domainShortName;

    /** Attribute  Be Seted Falg */
    private boolean domainShortNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainShortNameNull = false;

    /** Attribute */
    private String domainSmallIcon;

    /** Attribute  Be Seted Falg */
    private boolean domainSmallIconSetted = false;

    /** Attribute  is Null Falg */
    private boolean domainSmallIconNull = false;

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
     * Get DomainCode
     *
     * @return domainCode
     */
    final public String getDomainCode() {
        return domainCode;
    } // end getDomainCode()

    /**
     * Set DomainCode
     *
     * @param aDomainCode
     */
    final public void setDomainCode(String aDomainCode) {
        this.domainCode = aDomainCode;

        this.domainCodeSetted = true;

        this.setDomainCodeNull(this.domainCode == null);
    } // end setDomainCode()

    /**
     * Get DomainCode Has Been Setted
     *
     * @return domainCode
     */
    final public boolean isDomainCodeSetted() {
        return this.domainCodeSetted;
    } // end isDomainCodeSetted()

    /**
     * Set DomainCode Null
     */
    final public void setDomainCodeNull() {
        this.domainCodeNull = true;
    } // end setDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainCodeNull(boolean aNullFlag) {
        this.domainCodeNull = aNullFlag;
    } // end setDomainCodeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainCodeNull() {
        return this.domainCodeNull;
    } // end isDomainCodeNull()

    /**
     * Get DomainIcon
     *
     * @return domainIcon
     */
    final public String getDomainIcon() {
        return domainIcon;
    } // end getDomainIcon()

    /**
     * Set DomainIcon
     *
     * @param aDomainIcon
     */
    final public void setDomainIcon(String aDomainIcon) {
        this.domainIcon = aDomainIcon;

        this.domainIconSetted = true;

        this.setDomainIconNull(this.domainIcon == null);
    } // end setDomainIcon()

    /**
     * Get DomainIcon Has Been Setted
     *
     * @return domainIcon
     */
    final public boolean isDomainIconSetted() {
        return this.domainIconSetted;
    } // end isDomainIconSetted()

    /**
     * Set DomainIcon Null
     */
    final public void setDomainIconNull() {
        this.domainIconNull = true;
    } // end setDomainIconNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainIconNull(boolean aNullFlag) {
        this.domainIconNull = aNullFlag;
    } // end setDomainIconNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainIconNull() {
        return this.domainIconNull;
    } // end isDomainIconNull()

    /**
     * Get DomainName
     *
     * @return domainName
     */
    final public String getDomainName() {
        return domainName;
    } // end getDomainName()

    /**
     * Set DomainName
     *
     * @param aDomainName
     */
    final public void setDomainName(String aDomainName) {
        this.domainName = aDomainName;

        this.domainNameSetted = true;

        this.setDomainNameNull(this.domainName == null);
    } // end setDomainName()

    /**
     * Get DomainName Has Been Setted
     *
     * @return domainName
     */
    final public boolean isDomainNameSetted() {
        return this.domainNameSetted;
    } // end isDomainNameSetted()

    /**
     * Set DomainName Null
     */
    final public void setDomainNameNull() {
        this.domainNameNull = true;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainNameNull(boolean aNullFlag) {
        this.domainNameNull = aNullFlag;
    } // end setDomainNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainNameNull() {
        return this.domainNameNull;
    } // end isDomainNameNull()

    /**
     * Get DomainTitelKey
     *
     * @return domainTitelKey
     */
    final public String getDomainTitelKey() {
        return domainTitelKey;
    } // end getDomainTitelKey()

    /**
     * Set DomainTitelKey
     *
     * @param aDomainTitelKey
     */
    final public void setDomainTitelKey(String aDomainTitelKey) {
        this.domainTitelKey = aDomainTitelKey;

        this.domainTitelKeySetted = true;

        this.setDomainTitelKeyNull(this.domainTitelKey == null);
    } // end setDomainTitelKey()

    /**
     * Get DomainTitelKey Has Been Setted
     *
     * @return domainTitelKey
     */
    final public boolean isDomainTitelKeySetted() {
        return this.domainTitelKeySetted;
    } // end isDomainTitelKeySetted()

    /**
     * Set DomainTitelKey Null
     */
    final public void setDomainTitelKeyNull() {
        this.domainTitelKeyNull = true;
    } // end setDomainTitelKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainTitelKeyNull(boolean aNullFlag) {
        this.domainTitelKeyNull = aNullFlag;
    } // end setDomainTitelKeyNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainTitelKeyNull() {
        return this.domainTitelKeyNull;
    } // end isDomainTitelKeyNull()

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
     * Get SortIndex
     *
     * @return sortIndex
     */
    final public Integer getSortIndex() {
        return sortIndex;
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    final public void setSortIndex(Integer aSortIndex) {
        this.sortIndex = aSortIndex;

        this.sortIndexSetted = true;

        this.setSortIndexNull(this.sortIndex == null);
    } // end setSortIndex()

    /**
     * Get SortIndex Has Been Setted
     *
     * @return sortIndex
     */
    final public boolean isSortIndexSetted() {
        return this.sortIndexSetted;
    } // end isSortIndexSetted()

    /**
     * Set SortIndex Null
     */
    final public void setSortIndexNull() {
        this.sortIndexNull = true;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setSortIndexNull(boolean aNullFlag) {
        this.sortIndexNull = aNullFlag;
    } // end setSortIndexNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isSortIndexNull() {
        return this.sortIndexNull;
    } // end isSortIndexNull()

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
     * Get DomainShortName
     *
     * @return domainShortName
     */
    final public String getDomainShortName() {
        return domainShortName;
    } // end getDomainShortName()

    /**
     * Set DomainShortName
     *
     * @param aDomainShortName
     */
    final public void setDomainShortName(String aDomainShortName) {
        this.domainShortName = aDomainShortName;

        this.domainShortNameSetted = true;

        this.setDomainShortNameNull(this.domainShortName == null);
    } // end setDomainShortName()

    /**
     * Get DomainShortName Has Been Setted
     *
     * @return domainShortName
     */
    final public boolean isDomainShortNameSetted() {
        return this.domainShortNameSetted;
    } // end isDomainShortNameSetted()

    /**
     * Set DomainShortName Null
     */
    final public void setDomainShortNameNull() {
        this.domainShortNameNull = true;
    } // end setDomainShortNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainShortNameNull(boolean aNullFlag) {
        this.domainShortNameNull = aNullFlag;
    } // end setDomainShortNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainShortNameNull() {
        return this.domainShortNameNull;
    } // end isDomainShortNameNull()

    /**
     * Get DomainSmallIcon
     *
     * @return domainSmallIcon
     */
    final public String getDomainSmallIcon() {
        return domainSmallIcon;
    } // end getDomainSmallIcon()

    /**
     * Set DomainSmallIcon
     *
     * @param aDomainSmallIcon
     */
    final public void setDomainSmallIcon(String aDomainSmallIcon) {
        this.domainSmallIcon = aDomainSmallIcon;

        this.domainSmallIconSetted = true;

        this.setDomainSmallIconNull(this.domainSmallIcon == null);
    } // end setDomainSmallIcon()

    /**
     * Get DomainSmallIcon Has Been Setted
     *
     * @return domainSmallIcon
     */
    final public boolean isDomainSmallIconSetted() {
        return this.domainSmallIconSetted;
    } // end isDomainSmallIconSetted()

    /**
     * Set DomainSmallIcon Null
     */
    final public void setDomainSmallIconNull() {
        this.domainSmallIconNull = true;
    } // end setDomainSmallIconNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDomainSmallIconNull(boolean aNullFlag) {
        this.domainSmallIconNull = aNullFlag;
    } // end setDomainSmallIconNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDomainSmallIconNull() {
        return this.domainSmallIconNull;
    } // end isDomainSmallIconNull()

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

        if ((obj instanceof SysDomain) == false) {
            return false;
        } // end if

        SysDomain other = (SysDomain) obj;

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

        buffer.append("domainCode=");
        buffer.append(this.domainCode);
        buffer.append("\r\n");

        buffer.append("domainIcon=");
        buffer.append(this.domainIcon);
        buffer.append("\r\n");

        buffer.append("domainName=");
        buffer.append(this.domainName);
        buffer.append("\r\n");

        buffer.append("domainTitelKey=");
        buffer.append(this.domainTitelKey);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("sortIndex=");
        buffer.append(this.sortIndex);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("domainShortName=");
        buffer.append(this.domainShortName);
        buffer.append("\r\n");

        buffer.append("domainSmallIcon=");
        buffer.append(this.domainSmallIcon);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end SysDomain
