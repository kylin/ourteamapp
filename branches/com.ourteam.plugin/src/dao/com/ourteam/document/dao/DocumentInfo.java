/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

/**
 * ÎÄµµÐÅÏ¢ Generate Date 2011-09-22 10:16:22
 *
 * @author Auto Gen
 */
public class DocumentInfo implements java.io.Serializable {
    /**
     * Creates a new DocumentInfo object.
     */
    public DocumentInfo() {
        super();
    } // end DocumentInfo()

    /** Attribute */
    private long id;

    /** Attribute  Be Seted Falg */
    private boolean idSetted = false;

    /** Attribute  is Null Falg */
    private boolean idNull = false;

    /** Attribute */
    private String documentLanguage;

    /** Attribute  Be Seted Falg */
    private boolean documentLanguageSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentLanguageNull = false;

    /** Attribute */
    private String documentLastModifier;

    /** Attribute  Be Seted Falg */
    private boolean documentLastModifierSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentLastModifierNull = false;

    /** Attribute */
    private java.util.Date documentLastModifyDate;

    /** Attribute  Be Seted Falg */
    private boolean documentLastModifyDateSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentLastModifyDateNull = false;

    /** Attribute */
    private String documentName;

    /** Attribute  Be Seted Falg */
    private boolean documentNameSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentNameNull = false;

    /** Attribute */
    private String documentType;

    /** Attribute  Be Seted Falg */
    private boolean documentTypeSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentTypeNull = false;

    /** Attribute */
    private String documentVersion;

    /** Attribute  Be Seted Falg */
    private boolean documentVersionSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentVersionNull = false;

    /** Attribute */
    private long folderId;

    /** Attribute  Be Seted Falg */
    private boolean folderIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean folderIdNull = false;

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
    private String documentPath;

    /** Attribute  Be Seted Falg */
    private boolean documentPathSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentPathNull = false;

    /** Attribute */
    private long documentSize;

    /** Attribute  Be Seted Falg */
    private boolean documentSizeSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentSizeNull = false;

    /** Attribute */
    private long documentLastModifierId;

    /** Attribute  Be Seted Falg */
    private boolean documentLastModifierIdSetted = false;

    /** Attribute  is Null Falg */
    private boolean documentLastModifierIdNull = false;

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
     * Get DocumentLanguage
     *
     * @return documentLanguage
     */
    final public String getDocumentLanguage() {
        return documentLanguage;
    } // end getDocumentLanguage()

    /**
     * Set DocumentLanguage
     *
     * @param aDocumentLanguage
     */
    final public void setDocumentLanguage(String aDocumentLanguage) {
        this.documentLanguage = aDocumentLanguage;

        this.documentLanguageSetted = true;

        this.setDocumentLanguageNull(this.documentLanguage == null);
    } // end setDocumentLanguage()

    /**
     * Get DocumentLanguage Has Been Setted
     *
     * @return documentLanguage
     */
    final public boolean isDocumentLanguageSetted() {
        return this.documentLanguageSetted;
    } // end isDocumentLanguageSetted()

    /**
     * Set DocumentLanguage Null
     */
    final public void setDocumentLanguageNull() {
        this.documentLanguageNull = true;
    } // end setDocumentLanguageNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentLanguageNull(boolean aNullFlag) {
        this.documentLanguageNull = aNullFlag;
    } // end setDocumentLanguageNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentLanguageNull() {
        return this.documentLanguageNull;
    } // end isDocumentLanguageNull()

    /**
     * Get DocumentLastModifier
     *
     * @return documentLastModifier
     */
    final public String getDocumentLastModifier() {
        return documentLastModifier;
    } // end getDocumentLastModifier()

    /**
     * Set DocumentLastModifier
     *
     * @param aDocumentLastModifier
     */
    final public void setDocumentLastModifier(String aDocumentLastModifier) {
        this.documentLastModifier = aDocumentLastModifier;

        this.documentLastModifierSetted = true;

        this.setDocumentLastModifierNull(this.documentLastModifier == null);
    } // end setDocumentLastModifier()

    /**
     * Get DocumentLastModifier Has Been Setted
     *
     * @return documentLastModifier
     */
    final public boolean isDocumentLastModifierSetted() {
        return this.documentLastModifierSetted;
    } // end isDocumentLastModifierSetted()

    /**
     * Set DocumentLastModifier Null
     */
    final public void setDocumentLastModifierNull() {
        this.documentLastModifierNull = true;
    } // end setDocumentLastModifierNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentLastModifierNull(boolean aNullFlag) {
        this.documentLastModifierNull = aNullFlag;
    } // end setDocumentLastModifierNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentLastModifierNull() {
        return this.documentLastModifierNull;
    } // end isDocumentLastModifierNull()

    /**
     * Get DocumentLastModifyDate
     *
     * @return documentLastModifyDate
     */
    final public java.util.Date getDocumentLastModifyDate() {
        return documentLastModifyDate;
    } // end getDocumentLastModifyDate()

    /**
     * Set DocumentLastModifyDate
     *
     * @param aDocumentLastModifyDate
     */
    final public void setDocumentLastModifyDate(
        java.util.Date aDocumentLastModifyDate) {
        this.documentLastModifyDate = aDocumentLastModifyDate;

        this.documentLastModifyDateSetted = true;

        this.setDocumentLastModifyDateNull(this.documentLastModifyDate == null);
    } // end setDocumentLastModifyDate()

    /**
     * Get DocumentLastModifyDate Has Been Setted
     *
     * @return documentLastModifyDate
     */
    final public boolean isDocumentLastModifyDateSetted() {
        return this.documentLastModifyDateSetted;
    } // end isDocumentLastModifyDateSetted()

    /**
     * Set DocumentLastModifyDate Null
     */
    final public void setDocumentLastModifyDateNull() {
        this.documentLastModifyDateNull = true;
    } // end setDocumentLastModifyDateNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentLastModifyDateNull(boolean aNullFlag) {
        this.documentLastModifyDateNull = aNullFlag;
    } // end setDocumentLastModifyDateNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentLastModifyDateNull() {
        return this.documentLastModifyDateNull;
    } // end isDocumentLastModifyDateNull()

    /**
     * Get DocumentName
     *
     * @return documentName
     */
    final public String getDocumentName() {
        return documentName;
    } // end getDocumentName()

    /**
     * Set DocumentName
     *
     * @param aDocumentName
     */
    final public void setDocumentName(String aDocumentName) {
        this.documentName = aDocumentName;

        this.documentNameSetted = true;

        this.setDocumentNameNull(this.documentName == null);
    } // end setDocumentName()

    /**
     * Get DocumentName Has Been Setted
     *
     * @return documentName
     */
    final public boolean isDocumentNameSetted() {
        return this.documentNameSetted;
    } // end isDocumentNameSetted()

    /**
     * Set DocumentName Null
     */
    final public void setDocumentNameNull() {
        this.documentNameNull = true;
    } // end setDocumentNameNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentNameNull(boolean aNullFlag) {
        this.documentNameNull = aNullFlag;
    } // end setDocumentNameNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentNameNull() {
        return this.documentNameNull;
    } // end isDocumentNameNull()

    /**
     * Get DocumentType
     *
     * @return documentType
     */
    final public String getDocumentType() {
        return documentType;
    } // end getDocumentType()

    /**
     * Set DocumentType
     *
     * @param aDocumentType
     */
    final public void setDocumentType(String aDocumentType) {
        this.documentType = aDocumentType;

        this.documentTypeSetted = true;

        this.setDocumentTypeNull(this.documentType == null);
    } // end setDocumentType()

    /**
     * Get DocumentType Has Been Setted
     *
     * @return documentType
     */
    final public boolean isDocumentTypeSetted() {
        return this.documentTypeSetted;
    } // end isDocumentTypeSetted()

    /**
     * Set DocumentType Null
     */
    final public void setDocumentTypeNull() {
        this.documentTypeNull = true;
    } // end setDocumentTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentTypeNull(boolean aNullFlag) {
        this.documentTypeNull = aNullFlag;
    } // end setDocumentTypeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentTypeNull() {
        return this.documentTypeNull;
    } // end isDocumentTypeNull()

    /**
     * Get DocumentVersion
     *
     * @return documentVersion
     */
    final public String getDocumentVersion() {
        return documentVersion;
    } // end getDocumentVersion()

    /**
     * Set DocumentVersion
     *
     * @param aDocumentVersion
     */
    final public void setDocumentVersion(String aDocumentVersion) {
        this.documentVersion = aDocumentVersion;

        this.documentVersionSetted = true;

        this.setDocumentVersionNull(this.documentVersion == null);
    } // end setDocumentVersion()

    /**
     * Get DocumentVersion Has Been Setted
     *
     * @return documentVersion
     */
    final public boolean isDocumentVersionSetted() {
        return this.documentVersionSetted;
    } // end isDocumentVersionSetted()

    /**
     * Set DocumentVersion Null
     */
    final public void setDocumentVersionNull() {
        this.documentVersionNull = true;
    } // end setDocumentVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentVersionNull(boolean aNullFlag) {
        this.documentVersionNull = aNullFlag;
    } // end setDocumentVersionNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentVersionNull() {
        return this.documentVersionNull;
    } // end isDocumentVersionNull()

    /**
     * Get FolderId
     *
     * @return folderId
     */
    final public long getFolderId() {
        return folderId;
    } // end getFolderId()

    /**
     * Set FolderId
     *
     * @param aFolderId
     */
    final public void setFolderId(long aFolderId) {
        this.folderId = aFolderId;

        this.folderIdSetted = true;

        this.setFolderIdNull(false);
    } // end setFolderId()

    /**
     * Get FolderId Has Been Setted
     *
     * @return folderId
     */
    final public boolean isFolderIdSetted() {
        return this.folderIdSetted;
    } // end isFolderIdSetted()

    /**
     * Set FolderId Null
     */
    final public void setFolderIdNull() {
        this.folderIdNull = true;
    } // end setFolderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setFolderIdNull(boolean aNullFlag) {
        this.folderIdNull = aNullFlag;
    } // end setFolderIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isFolderIdNull() {
        return this.folderIdNull;
    } // end isFolderIdNull()

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
     * Get DocumentPath
     *
     * @return documentPath
     */
    final public String getDocumentPath() {
        if (isDocumentPathNull()) {
            return null;
        } // end if
        else {
            return documentPath;
        } // end else
    } // end getDocumentPath()

    /**
     * Set DocumentPath
     *
     * @param aDocumentPath
     */
    final public void setDocumentPath(String aDocumentPath) {
        this.documentPath = aDocumentPath;

        this.documentPathSetted = true;

        this.setDocumentPathNull(this.documentPath == null);
    } // end setDocumentPath()

    /**
     * Get DocumentPath Has Been Setted
     *
     * @return documentPath
     */
    final public boolean isDocumentPathSetted() {
        return this.documentPathSetted;
    } // end isDocumentPathSetted()

    /**
     * Set DocumentPath Null
     */
    final public void setDocumentPathNull() {
        this.documentPathNull = true;
    } // end setDocumentPathNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentPathNull(boolean aNullFlag) {
        this.documentPathNull = aNullFlag;
    } // end setDocumentPathNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentPathNull() {
        return this.documentPathNull;
    } // end isDocumentPathNull()

    /**
     * Get DocumentSize
     *
     * @return documentSize
     */
    final public long getDocumentSize() {
        return documentSize;
    } // end getDocumentSize()

    /**
     * Set DocumentSize
     *
     * @param aDocumentSize
     */
    final public void setDocumentSize(long aDocumentSize) {
        this.documentSize = aDocumentSize;

        this.documentSizeSetted = true;

        this.setDocumentSizeNull(false);
    } // end setDocumentSize()

    /**
     * Get DocumentSize Has Been Setted
     *
     * @return documentSize
     */
    final public boolean isDocumentSizeSetted() {
        return this.documentSizeSetted;
    } // end isDocumentSizeSetted()

    /**
     * Set DocumentSize Null
     */
    final public void setDocumentSizeNull() {
        this.documentSizeNull = true;
    } // end setDocumentSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentSizeNull(boolean aNullFlag) {
        this.documentSizeNull = aNullFlag;
    } // end setDocumentSizeNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentSizeNull() {
        return this.documentSizeNull;
    } // end isDocumentSizeNull()

    /**
     * Get DocumentLastModifierId
     *
     * @return documentLastModifierId
     */
    final public long getDocumentLastModifierId() {
        return documentLastModifierId;
    } // end getDocumentLastModifierId()

    /**
     * Set DocumentLastModifierId
     *
     * @param aDocumentLastModifierId
     */
    final public void setDocumentLastModifierId(long aDocumentLastModifierId) {
        this.documentLastModifierId = aDocumentLastModifierId;

        this.documentLastModifierIdSetted = true;

        this.setDocumentLastModifierIdNull(false);
    } // end setDocumentLastModifierId()

    /**
     * Get DocumentLastModifierId Has Been Setted
     *
     * @return documentLastModifierId
     */
    final public boolean isDocumentLastModifierIdSetted() {
        return this.documentLastModifierIdSetted;
    } // end isDocumentLastModifierIdSetted()

    /**
     * Set DocumentLastModifierId Null
     */
    final public void setDocumentLastModifierIdNull() {
        this.documentLastModifierIdNull = true;
    } // end setDocumentLastModifierIdNull()

    /**
     * DOCUMENT ME!
     *
     * @param aNullFlag DOCUMENT ME!
     */
    final public void setDocumentLastModifierIdNull(boolean aNullFlag) {
        this.documentLastModifierIdNull = aNullFlag;
    } // end setDocumentLastModifierIdNull()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    final public boolean isDocumentLastModifierIdNull() {
        return this.documentLastModifierIdNull;
    } // end isDocumentLastModifierIdNull()

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

        if ((obj instanceof DocumentInfo) == false) {
            return false;
        } // end if

        DocumentInfo other = (DocumentInfo) obj;

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

        buffer.append("documentLanguage=");
        buffer.append(this.documentLanguage);
        buffer.append("\r\n");

        buffer.append("documentLastModifier=");
        buffer.append(this.documentLastModifier);
        buffer.append("\r\n");

        buffer.append("documentLastModifyDate=");
        buffer.append(this.documentLastModifyDate);
        buffer.append("\r\n");

        buffer.append("documentName=");
        buffer.append(this.documentName);
        buffer.append("\r\n");

        buffer.append("documentType=");
        buffer.append(this.documentType);
        buffer.append("\r\n");

        buffer.append("documentVersion=");
        buffer.append(this.documentVersion);
        buffer.append("\r\n");

        buffer.append("folderId=");
        buffer.append(this.folderId);
        buffer.append("\r\n");

        buffer.append("remarks=");
        buffer.append(this.remarks);
        buffer.append("\r\n");

        buffer.append("status=");
        buffer.append(this.status);
        buffer.append("\r\n");

        buffer.append("documentPath=");
        buffer.append(this.documentPath);
        buffer.append("\r\n");

        buffer.append("documentSize=");
        buffer.append(this.documentSize);
        buffer.append("\r\n");

        buffer.append("documentLastModifierId=");
        buffer.append(this.documentLastModifierId);
        buffer.append("\r\n");

        buffer.append("lockToken=");
        buffer.append(this.lockToken);
        buffer.append("\r\n");

        buffer.append("]");

        return buffer.toString();
    } // end toString()
} // end DocumentInfo
