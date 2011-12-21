/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IDocumentFolder Data Access Object
*  GenDate 2011-09-22 10:16:22  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseDocumentFolderDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "DOCUMENT_FOLDER";

    /** Attribute */
    static final String Id = "DOCUMENT_FOLDER.ID";

    /** Attribute */
    static final String FolderName = "DOCUMENT_FOLDER.FOLDER_NAME";

    /** Attribute */
    static final String ParentFolderId = "DOCUMENT_FOLDER.PARENT_FOLDER_ID";

    /** Attribute */
    static final String Remarks = "DOCUMENT_FOLDER.REMARKS";

    /** Attribute */
    static final String SortIndex = "DOCUMENT_FOLDER.SORT_INDEX";

    /** Attribute */
    static final String Status = "DOCUMENT_FOLDER.STATUS";

    /** Attribute */
    static final String FolderPath = "DOCUMENT_FOLDER.FOLDER_PATH";

    /** Attribute */
    static final String LockToken = "DOCUMENT_FOLDER.LOCK_TOKEN";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String Id = "id";

        /** Attribute */
        static final String FolderName = "folderName";

        /** Attribute */
        static final String ParentFolderId = "parentFolderId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String FolderPath = "folderPath";

        /** Attribute */
        static final String LockToken = "lockToken";
    } // end DataProperty

    /**
     * Check Unique DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(DocumentFolder aDocumentFolder)
        throws Exception;

    /**
     * insert DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     *
     * @model
     */
    void insertDocumentFolder(DocumentFolder aDocumentFolder)
        throws Exception;

    /**
     * Batch Insert DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertDocumentFolder(DocumentFolder[] aDocumentFolder)
        throws Exception;

    /**
     * Delete DocumentFolder
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDocumentFolder(final long aId) throws Exception;

    /**
     * Delete DocumentFolder By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDocumentFolder(DocumentFolderDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     *
     * @model
     */
    void updateDocumentFolder(DocumentFolder aDocumentFolder)
        throws Exception;

    /**
     * Batch Modify DocumentFolder
     *
     * @param aDocumentFolder
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateDocumentFolder(DocumentFolder[] aDocumentFolder)
        throws Exception;

    /**
     * Modify DocumentFolder  By Query Conditions
     *
     * @param aDocumentFolder Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateDocumentFolder(DocumentFolder aDocumentFolder,
        DocumentFolderDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query DocumentFolder
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    DocumentFolder findDocumentFolderById(final long aId)
        throws Exception;

    /**
     * Query DocumentFolder
     *
     * @param aQueryBean
     *
     * @return IDocumentFolder[]
     *
     * @throws Exception
     *
     * @model type="IDocumentFolder" containment="true"
     */
    DocumentFolder[] queryDocumentFolder(DocumentFolderDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query DocumentFolder
     *
     * @param aBaseQueryBean
     *
     * @return IDocumentFolder[]
     *
     * @throws Exception
     *
     * @model type="IDocumentFolder" containment="true"
     */

    //Map queryDocumentFolderForMap(DocumentFolderDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count DocumentFolder
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryDocumentFolderCount(DocumentFolderDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query DocumentFolder Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryDocumentFolderSelective(
        DocumentFolderDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize DocumentFolder
     *
     * @param aDocumentFolders
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDocumentFolder(DocumentFolder[] aDocumentFolders,
        DocumentFolderDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize DocumentFolder
     *
     * @param aDocumentFolders
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDocumentFolder(DocumentFolder[] aDocumentFolders,
        DocumentFolderDAOQueryBean aQueryBean,
        DocumentFolderSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DocumentFolderSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddDocumentFolderArray DOCUMENT ME!
         * @param willUpdateDocumentFolderArray DOCUMENT ME!
         * @param willDeleteDocumentFolderArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            DocumentFolder[] willAddDocumentFolderArray,
            DocumentFolder[] willUpdateDocumentFolderArray,
            DocumentFolder[] willDeleteDocumentFolderArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(DocumentFolder[] aDocumentFolders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(DocumentFolder[] aDocumentFolders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(DocumentFolder[] aDocumentFolders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(DocumentFolder[] aDocumentFolders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(DocumentFolder[] aDocumentFolders)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentFolders DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(DocumentFolder[] aDocumentFolders)
            throws Exception;
    } // end DocumentFolderSynchronizeCallback
} // end IBaseDocumentFolderDAO
