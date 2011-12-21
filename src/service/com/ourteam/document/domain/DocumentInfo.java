/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * ÎÄµµÐÅÏ¢ Generate date 2011-09-22 10:22:14
 *
 * @model auto gen
 */
public class DocumentInfo implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.document.dao.DocumentInfo objDocumentInfo;

    static {
        mappedDaoFields.put("id", com.ourteam.document.dao.IDocumentInfoDAO.Id);

        mappedDaoFields.put("documentLanguage",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentLanguage);

        mappedDaoFields.put("documentLastModifier",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentLastModifier);

        mappedDaoFields.put("documentLastModifyDate",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentLastModifyDate);

        mappedDaoFields.put("documentName",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentName);

        mappedDaoFields.put("documentType",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentType);

        mappedDaoFields.put("documentVersion",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentVersion);

        mappedDaoFields.put("folderId",
            com.ourteam.document.dao.IDocumentInfoDAO.FolderId);

        mappedDaoFields.put("remarks",
            com.ourteam.document.dao.IDocumentInfoDAO.Remarks);

        mappedDaoFields.put("status",
            com.ourteam.document.dao.IDocumentInfoDAO.Status);

        mappedDaoFields.put("documentSize",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentSize);

        mappedDaoFields.put("documentLastModifierId",
            com.ourteam.document.dao.IDocumentInfoDAO.DocumentLastModifierId);
    } 

    /**
     * Creates a new DocumentInfo object.
     */
    public DocumentInfo() {
        super();

        objDocumentInfo = new com.ourteam.document.dao.DocumentInfo();
    } // end DocumentInfo()

    /**
     * Creates a new DocumentInfo object.
     *
     * @param aDocumentInfo DOCUMENT ME!
     */
    public DocumentInfo(com.ourteam.document.dao.DocumentInfo aDocumentInfo) {
        super();

        objDocumentInfo = aDocumentInfo;
    } // end DocumentInfo()

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
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.document.dao.DocumentInfo convertToDocumentInfo() {
        return objDocumentInfo;
    } // end convertToDocumentInfo()

    /**
     * DOCUMENT ME!
     */
    private byte[] documentContent = new byte[] {  };

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objDocumentInfo.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objDocumentInfo.setId(aId);
    } // end setId()

    /**
     * Get DocumentLanguage
     *
     * @return documentLanguage
     */
    public String getDocumentLanguage() {
        return objDocumentInfo.getDocumentLanguage();
    } // end getDocumentLanguage()

    /**
     * Set DocumentLanguage
     *
     * @param aDocumentLanguage
     */
    public void setDocumentLanguage(String aDocumentLanguage) {
        this.objDocumentInfo.setDocumentLanguage(aDocumentLanguage);
    } // end setDocumentLanguage()

    /**
     * Get DocumentLastModifier
     *
     * @return documentLastModifier
     */
    public String getDocumentLastModifier() {
        return objDocumentInfo.getDocumentLastModifier();
    } // end getDocumentLastModifier()

    /**
     * Set DocumentLastModifier
     *
     * @param aDocumentLastModifier
     */
    public void setDocumentLastModifier(String aDocumentLastModifier) {
        this.objDocumentInfo.setDocumentLastModifier(aDocumentLastModifier);
    } // end setDocumentLastModifier()

    /**
     * Get DocumentLastModifyDate
     *
     * @return documentLastModifyDate
     */
    public java.util.Date getDocumentLastModifyDate() {
        return objDocumentInfo.getDocumentLastModifyDate();
    } // end getDocumentLastModifyDate()

    /**
     * Set DocumentLastModifyDate
     *
     * @param aDocumentLastModifyDate
     */
    public void setDocumentLastModifyDate(
        java.util.Date aDocumentLastModifyDate) {
        this.objDocumentInfo.setDocumentLastModifyDate(aDocumentLastModifyDate);
    } // end setDocumentLastModifyDate()

    /**
     * Get DocumentName
     *
     * @return documentName
     */
    public String getDocumentName() {
        return objDocumentInfo.getDocumentName();
    } // end getDocumentName()

    /**
     * Set DocumentName
     *
     * @param aDocumentName
     */
    public void setDocumentName(String aDocumentName) {
        this.objDocumentInfo.setDocumentName(aDocumentName);
    } // end setDocumentName()

    /**
     * Get DocumentType
     *
     * @return documentType
     */
    public String getDocumentType() {
        return objDocumentInfo.getDocumentType();
    } // end getDocumentType()

    /**
     * Set DocumentType
     *
     * @param aDocumentType
     */
    public void setDocumentType(String aDocumentType) {
        this.objDocumentInfo.setDocumentType(aDocumentType);
    } // end setDocumentType()

    /**
     * Get DocumentVersion
     *
     * @return documentVersion
     */
    public String getDocumentVersion() {
        return objDocumentInfo.getDocumentVersion();
    } // end getDocumentVersion()

    /**
     * Set DocumentVersion
     *
     * @param aDocumentVersion
     */
    public void setDocumentVersion(String aDocumentVersion) {
        this.objDocumentInfo.setDocumentVersion(aDocumentVersion);
    } // end setDocumentVersion()

    /**
     * Get FolderId
     *
     * @return folderId
     */
    public long getFolderId() {
        return objDocumentInfo.getFolderId();
    } // end getFolderId()

    /**
     * Set FolderId
     *
     * @param aFolderId
     */
    public void setFolderId(long aFolderId) {
        this.objDocumentInfo.setFolderId(aFolderId);
    } // end setFolderId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objDocumentInfo.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objDocumentInfo.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objDocumentInfo.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objDocumentInfo.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get DocumentContent
     *
     * @return documentContent
     */
    public byte[] getDocumentContent() {
        return documentContent;
    } // end getDocumentContent()

    /**
     * Set DocumentContent
     *
     * @param aDocumentContent
     */
    public void setDocumentContent(byte[] aDocumentContent) {
        this.documentContent = aDocumentContent;
    } // end setDocumentContent()

    /**
     * Get DocumentSize
     *
     * @return documentSize
     */
    public long getDocumentSize() {
        return objDocumentInfo.getDocumentSize();
    } // end getDocumentSize()

    /**
     * Set DocumentSize
     *
     * @param aDocumentSize
     */
    public void setDocumentSize(long aDocumentSize) {
        this.objDocumentInfo.setDocumentSize(aDocumentSize);
    } // end setDocumentSize()

    /**
     * Get DocumentLastModifierId
     *
     * @return documentLastModifierId
     */
    public long getDocumentLastModifierId() {
        return objDocumentInfo.getDocumentLastModifierId();
    } // end getDocumentLastModifierId()

    /**
     * Set DocumentLastModifierId
     *
     * @param aDocumentLastModifierId
     */
    public void setDocumentLastModifierId(long aDocumentLastModifierId) {
        this.objDocumentInfo.setDocumentLastModifierId(aDocumentLastModifierId);
    } // end setDocumentLastModifierId()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int hashCode() {
        return org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(this);
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

        boolean isEqual = false;

        com.ourteam.document.dao.DocumentInfo tempDocumentInfo = other.convertToDocumentInfo();

        if ((tempDocumentInfo == null) || (this.objDocumentInfo == null)) {
            isEqual = false;
        } // end if
        else if ((tempDocumentInfo == this.objDocumentInfo) ||
                tempDocumentInfo.equals(this.objDocumentInfo)) {
            isEqual = true;
        } // end else if
        else {
            isEqual = false;
        } // end else

        return isEqual;
    } // end equals()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentInfos DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DocumentInfo[] toArray(
        com.ourteam.document.dao.DocumentInfo[] aDocumentInfos) {
        return toArray(aDocumentInfos, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentInfos DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DocumentInfo[] toArray(
        com.ourteam.document.dao.DocumentInfo[] aDocumentInfos,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aDocumentInfos)) {
            return new DocumentInfo[0];
        } // end if

        int length = aDocumentInfos.length;

        DocumentInfo[] beans = new DocumentInfo[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new DocumentInfo(aDocumentInfos[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new DocumentInfo(aDocumentInfos[i]);

                aCallBack.populate(beans[i], new Object[] { aDocumentInfos[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end DocumentInfo
