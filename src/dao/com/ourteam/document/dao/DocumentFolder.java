/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

/**
 * ÎÄµµÄ¿Â¼ Generate Date 2011-09-22 10:16:22
 *
 * @author Auto Gen
 */
public class DocumentFolder implements java.io.Serializable {
    /**
     * Creates a new DocumentFolder object.
     */
    public DocumentFolder() {
        super();
    } // end DocumentFolder()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String folderName;

    /** Attribute  Be Seted Falg */
    private boolean folderNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean folderNameNull = false;

    /** Attribute */
    private long parentFolderId;

    /** Attribute  Be Seted Falg */
    private boolean parentFolderIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean parentFolderIdNull = false;

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
    private String folderPath;

    /** Attribute  Be Seted Falg */
    private boolean folderPathSetted = false;

    /** Attribute  is Null Falg */
    private boolean folderPathNull = false;

    /** Attribute */
    private String lockToken;

    /** Attribute  Be Seted Falg */
    private boolean lockTokenSetted = false;

    /** Attribute  is Null Falg */
    private boolean lockTokenNull = false;

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
     * Get FolderName
     *
     * @return folderName
     */
    final public String getFolderName() {
        return folderName;
    } // end getFolderName()

    /**
     * Set FolderName
     *
     * @param aFolderName
     */
    final public void setFolderName(String aFolderName) {
        this.folderName = aFolderName;

        this.folderNameSetted = true;

        this.setFolderNameNull(this.folderName == null);
    } // end setFolderName()

    /**
     * Get FolderName Has Been Setted
     *
     * @return folderName
     */
    final public boolean isFolderNameSetted() {
        return this.folderNameSetted;
    } // end isFolderNameSetted()

    /**
     * Set FolderName Null
     */
    final public void setFolderNameNull() {
        this.folderNameNull = true;
    } // end setFolderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFolderNameNull(boolean aNullFlag) {
        this.folderNameNull = aNullFlag;
    } // end setFolderNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFolderNameNull() {
        return this.folderNameNull;
    } // end isFolderNameNull()

    /**
     * Get ParentFolderId
     *
     * @return parentFolderId
     */
    final public long getParentFolderId() {
        return parentFolderId;
    } // end getParentFolderId()

    /**
     * Set ParentFolderId
     *
     * @param aParentFolderId
     */
    final public void setParentFolderId(long aParentFolderId) {
        this.parentFolderId = aParentFolderId;

        this.parentFolderIdSetted = true;

        this.setParentFolderIdNull(false);
    } // end setParentFolderId()

    /**
     * Get ParentFolderId Has Been Setted
     *
     * @return parentFolderId
     */
    final public boolean isParentFolderIdSetted() {
        return this.parentFolderIdSetted;
    } // end isParentFolderIdSetted()

    /**
     * Set ParentFolderId Null
     */
    final public void setParentFolderIdNull() {
        this.parentFolderIdNull = true;
    } // end setParentFolderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setParentFolderIdNull(boolean aNullFlag) {
        this.parentFolderIdNull = aNullFlag;
    } // end setParentFolderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isParentFolderIdNull() {
        return this.parentFolderIdNull;
    } // end isParentFolderIdNull()

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
     * Get FolderPath
     *
     * @return folderPath
     */
    final public String getFolderPath() {
        if (isFolderPathNull()) {
            return null;
        } // end if
        else {
            return folderPath;
        } // end else
    } // end getFolderPath()

    /**
     * Set FolderPath
     *
     * @param aFolderPath
     */
    final public void setFolderPath(String aFolderPath) {
        this.folderPath = aFolderPath;

        this.folderPathSetted = true;

        this.setFolderPathNull(this.folderPath == null);
    } // end setFolderPath()

    /**
     * Get FolderPath Has Been Setted
     *
     * @return folderPath
     */
    final public boolean isFolderPathSetted() {
        return this.folderPathSetted;
    } // end isFolderPathSetted()

    /**
     * Set FolderPath Null
     */
    final public void setFolderPathNull() {
        this.folderPathNull = true;
    } // end setFolderPathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFolderPathNull(boolean aNullFlag) {
        this.folderPathNull = aNullFlag;
    } // end setFolderPathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFolderPathNull() {
        return this.folderPathNull;
    } // end isFolderPathNull()

    /**
     * Get LockToken
     *
     * @return lockToken
     */
    final public String getLockToken() {
        return lockToken;
    } // end getLockToken()

    /**
     * Set LockToken
     *
     * @param aLockToken
     */
    final public void setLockToken(String aLockToken) {
        this.lockToken = aLockToken;

        this.lockTokenSetted = true;

        this.setLockTokenNull(this.lockToken == null);
    } // end setLockToken()

    /**
     * Get LockToken Has Been Setted
     *
     * @return lockToken
     */
    final public boolean isLockTokenSetted() {
        return this.lockTokenSetted;
    } // end isLockTokenSetted()

    /**
     * Set LockToken Null
     */
    final public void setLockTokenNull() {
        this.lockTokenNull = true;
    } // end setLockTokenNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setLockTokenNull(boolean aNullFlag) {
        this.lockTokenNull = aNullFlag;
    } // end setLockTokenNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isLockTokenNull() {
        return this.lockTokenNull;
    } // end isLockTokenNull()

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

        if ((obj instanceof DocumentFolder) == false) {
            return false;
        } // end if

        DocumentFolder other = (DocumentFolder) obj;

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

        buffer.append("folderName=");
        buffer.append(this.folderName);
        buffer.append("\r\n");

        buffer.append("parentFolderId=");
        buffer.append(this.parentFolderId);
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

        buffer.append("folderPath=");
        buffer.append(this.folderPath);
        buffer.append("\r\n");

        buffer.append("lockToken=");
        buffer.append(this.lockToken);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end DocumentFolder
