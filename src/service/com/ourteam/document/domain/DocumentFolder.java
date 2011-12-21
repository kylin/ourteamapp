/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.domain;

import net.dao.IDataPopulateCallback;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;


/**
 * 文档目录 Generate date 2011-09-22 10:22:14
 *
 * @model auto gen
 */
public class DocumentFolder implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static Map mappedDaoFields = new HashMap();

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.document.dao.DocumentFolder objDocumentFolder;

    static {
        mappedDaoFields.put("id", com.ourteam.document.dao.IDocumentFolderDAO.Id);

        mappedDaoFields.put("folderName",
            com.ourteam.document.dao.IDocumentFolderDAO.FolderName);

        mappedDaoFields.put("parentFolderId",
            com.ourteam.document.dao.IDocumentFolderDAO.ParentFolderId);

        mappedDaoFields.put("remarks",
            com.ourteam.document.dao.IDocumentFolderDAO.Remarks);

        mappedDaoFields.put("sortIndex",
            com.ourteam.document.dao.IDocumentFolderDAO.SortIndex);

        mappedDaoFields.put("status",
            com.ourteam.document.dao.IDocumentFolderDAO.Status);

        mappedDaoFields.put("folderPath",
            com.ourteam.document.dao.IDocumentFolderDAO.FolderPath);
    } 

    /**
     * Creates a new DocumentFolder object.
     */
    public DocumentFolder() {
        super();

        objDocumentFolder = new com.ourteam.document.dao.DocumentFolder();
    } // end DocumentFolder()

    /**
     * Creates a new DocumentFolder object.
     *
     * @param aDocumentFolder DOCUMENT ME!
     */
    public DocumentFolder(
        com.ourteam.document.dao.DocumentFolder aDocumentFolder) {
        super();

        objDocumentFolder = aDocumentFolder;
    } // end DocumentFolder()

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
    public com.ourteam.document.dao.DocumentFolder convertToDocumentFolder() {
        return objDocumentFolder;
    } // end convertToDocumentFolder()

    /**
     * Get Id
     *
     * @return id
     */
    public long getId() {
        return objDocumentFolder.getId();
    } // end getId()

    /**
     * Set Id
     *
     * @param aId
     */
    public void setId(long aId) {
        this.objDocumentFolder.setId(aId);
    } // end setId()

    /**
     * Get FolderName
     *
     * @return folderName
     */
    public String getFolderName() {
        return objDocumentFolder.getFolderName();
    } // end getFolderName()

    /**
     * Set FolderName
     *
     * @param aFolderName
     */
    public void setFolderName(String aFolderName) {
        this.objDocumentFolder.setFolderName(aFolderName);
    } // end setFolderName()

    /**
     * Get ParentFolderId
     *
     * @return parentFolderId
     */
    public long getParentFolderId() {
        return objDocumentFolder.getParentFolderId();
    } // end getParentFolderId()

    /**
     * Set ParentFolderId
     *
     * @param aParentFolderId
     */
    public void setParentFolderId(long aParentFolderId) {
        this.objDocumentFolder.setParentFolderId(aParentFolderId);
    } // end setParentFolderId()

    /**
     * Get Remarks
     *
     * @return remarks
     */
    public String getRemarks() {
        return objDocumentFolder.getRemarks();
    } // end getRemarks()

    /**
     * Set Remarks
     *
     * @param aRemarks
     */
    public void setRemarks(String aRemarks) {
        this.objDocumentFolder.setRemarks(aRemarks);
    } // end setRemarks()

    /**
     * Get SortIndex
     *
     * @return sortIndex
     */
    public Integer getSortIndex() {
        return objDocumentFolder.getSortIndex();
    } // end getSortIndex()

    /**
     * Set SortIndex
     *
     * @param aSortIndex
     */
    public void setSortIndex(Integer aSortIndex) {
        this.objDocumentFolder.setSortIndex(aSortIndex);
    } // end setSortIndex()

    /**
     * Get Status
     *
     * @return status
     */
    public String getStatus() {
        return objDocumentFolder.getStatus();
    } // end getStatus()

    /**
     * Set Status
     *
     * @param aStatus
     */
    public void setStatus(String aStatus) {
        this.objDocumentFolder.setStatus(aStatus);
    } // end setStatus()

    /**
     * Get FolderPath 文档目录路径
     *
     * @return folderPath
     */
    public String getFolderPath() {
        return objDocumentFolder.getFolderPath();
    } // end getFolderPath()

    /**
     * Set FolderPath 文档目录路径
     *
     * @param aFolderPath
     */
    public void setFolderPath(String aFolderPath) {
        this.objDocumentFolder.setFolderPath(aFolderPath);
    } // end setFolderPath()

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

        if ((obj instanceof DocumentFolder) == false) {
            return false;
        } // end if

        DocumentFolder other = (DocumentFolder) obj;

        boolean isEqual = false;

        com.ourteam.document.dao.DocumentFolder tempDocumentFolder = other.convertToDocumentFolder();

        if ((tempDocumentFolder == null) || (this.objDocumentFolder == null)) {
            isEqual = false;
        } // end if
        else if ((tempDocumentFolder == this.objDocumentFolder) ||
                tempDocumentFolder.equals(this.objDocumentFolder)) {
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
     * @param aDocumentFolders DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DocumentFolder[] toArray(
        com.ourteam.document.dao.DocumentFolder[] aDocumentFolders) {
        return toArray(aDocumentFolders, null);
    } // end toArray()

    /**
     * DOCUMENT ME!
     *
     * @param aDocumentFolders DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static DocumentFolder[] toArray(
        com.ourteam.document.dao.DocumentFolder[] aDocumentFolders,
        IDataPopulateCallback aCallBack) {
        if (org.apache.commons.lang.ArrayUtils.isEmpty(aDocumentFolders)) {
            return new DocumentFolder[0];
        } // end if

        int length = aDocumentFolders.length;

        DocumentFolder[] beans = new DocumentFolder[length];

        if (aCallBack == null) {
            for (int i = 0; i < length; i++) {
                beans[i] = new DocumentFolder(aDocumentFolders[i]);
            } // end for
        } // end if
        else {
            for (int i = 0; i < length; i++) {
                beans[i] = new DocumentFolder(aDocumentFolders[i]);

                aCallBack.populate(beans[i],
                    new Object[] { aDocumentFolders[i] });
            } // end for
        } // end else

        return beans;
    } // end toArray()
} // end DocumentFolder
