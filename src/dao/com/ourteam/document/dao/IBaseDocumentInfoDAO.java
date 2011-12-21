/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.document.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IDocumentInfo Data Access Object
*  GenDate 2011-09-22 10:16:23  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseDocumentInfoDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "DOCUMENT_INFO";

    /** Attribute */
    static final String Id = "DOCUMENT_INFO.ID";

    /** Attribute */
    static final String DocumentLanguage = "DOCUMENT_INFO.DOCUMENT_LANGUAGE";

    /** Attribute */
    static final String DocumentLastModifier = "DOCUMENT_INFO.DOCUMENT_LAST_MODIFIER";

    /** Attribute */
    static final String DocumentLastModifyDate = "DOCUMENT_INFO.DOCUMENT_LAST_MODIFY_DATE";

    /** Attribute */
    static final String DocumentName = "DOCUMENT_INFO.DOCUMENT_NAME";

    /** Attribute */
    static final String DocumentType = "DOCUMENT_INFO.DOCUMENT_TYPE";

    /** Attribute */
    static final String DocumentVersion = "DOCUMENT_INFO.DOCUMENT_VERSION";

    /** Attribute */
    static final String FolderId = "DOCUMENT_INFO.FOLDER_ID";

    /** Attribute */
    static final String Remarks = "DOCUMENT_INFO.REMARKS";

    /** Attribute */
    static final String Status = "DOCUMENT_INFO.STATUS";

    /** Attribute */
    static final String DocumentPath = "DOCUMENT_INFO.DOCUMENT_PATH";

    /** Attribute */
    static final String DocumentSize = "DOCUMENT_INFO.DOCUMENT_SIZE";

    /** Attribute */
    static final String DocumentLastModifierId = "DOCUMENT_INFO.DOCUMENT_LAST_MODIFYER_ID";

    /** Attribute */
    static final String LockToken = "DOCUMENT_INFO.LOCK_TOKEN";

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
        static final String DocumentLanguage = "documentLanguage";

        /** Attribute */
        static final String DocumentLastModifier = "documentLastModifier";

        /** Attribute */
        static final String DocumentLastModifyDate = "documentLastModifyDate";

        /** Attribute */
        static final String DocumentName = "documentName";

        /** Attribute */
        static final String DocumentType = "documentType";

        /** Attribute */
        static final String DocumentVersion = "documentVersion";

        /** Attribute */
        static final String FolderId = "folderId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DocumentPath = "documentPath";

        /** Attribute */
        static final String DocumentSize = "documentSize";

        /** Attribute */
        static final String DocumentLastModifierId = "documentLastModifierId";

        /** Attribute */
        static final String LockToken = "lockToken";
    } // end DataProperty

    /**
     * Check Unique DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(DocumentInfo aDocumentInfo) throws Exception;

    /**
     * insert DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     *
     * @model
     */
    void insertDocumentInfo(DocumentInfo aDocumentInfo)
        throws Exception;

    /**
     * Batch Insert DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertDocumentInfo(DocumentInfo[] aDocumentInfo)
        throws Exception;

    /**
     * Delete DocumentInfo
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDocumentInfo(final long aId) throws Exception;

    /**
     * Delete DocumentInfo By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteDocumentInfo(DocumentInfoDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     *
     * @model
     */
    void updateDocumentInfo(DocumentInfo aDocumentInfo)
        throws Exception;

    /**
     * Batch Modify DocumentInfo
     *
     * @param aDocumentInfo
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateDocumentInfo(DocumentInfo[] aDocumentInfo)
        throws Exception;

    /**
     * Modify DocumentInfo  By Query Conditions
     *
     * @param aDocumentInfo Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateDocumentInfo(DocumentInfo aDocumentInfo,
        DocumentInfoDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query DocumentInfo
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    DocumentInfo findDocumentInfoById(final long aId) throws Exception;

    /**
     * Query DocumentInfo
     *
     * @param aQueryBean
     *
     * @return IDocumentInfo[]
     *
     * @throws Exception
     *
     * @model type="IDocumentInfo" containment="true"
     */
    DocumentInfo[] queryDocumentInfo(DocumentInfoDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query DocumentInfo
     *
     * @param aBaseQueryBean
     *
     * @return IDocumentInfo[]
     *
     * @throws Exception
     *
     * @model type="IDocumentInfo" containment="true"
     */

    //Map queryDocumentInfoForMap(DocumentInfoDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count DocumentInfo
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryDocumentInfoCount(DocumentInfoDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query DocumentInfo Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryDocumentInfoSelective(DocumentInfoDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize DocumentInfo
     *
     * @param aDocumentInfos
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDocumentInfo(DocumentInfo[] aDocumentInfos,
        DocumentInfoDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize DocumentInfo
     *
     * @param aDocumentInfos
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeDocumentInfo(DocumentInfo[] aDocumentInfos,
        DocumentInfoDAOQueryBean aQueryBean,
        DocumentInfoSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DocumentInfoSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddDocumentInfoArray DOCUMENT ME!
         * @param willUpdateDocumentInfoArray DOCUMENT ME!
         * @param willDeleteDocumentInfoArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(DocumentInfo[] willAddDocumentInfoArray,
            DocumentInfo[] willUpdateDocumentInfoArray,
            DocumentInfo[] willDeleteDocumentInfoArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(DocumentInfo[] aDocumentInfos)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(DocumentInfo[] aDocumentInfos)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(DocumentInfo[] aDocumentInfos)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(DocumentInfo[] aDocumentInfos)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(DocumentInfo[] aDocumentInfos)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aDocumentInfos DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(DocumentInfo[] aDocumentInfos)
            throws Exception;
    } // end DocumentInfoSynchronizeCallback
} // end IBaseDocumentInfoDAO
