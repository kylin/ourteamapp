/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessDefine Data Access Object
*  GenDate 2011-11-23 16:27:11  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_DEFINE";

    /** Attribute */
    static final String Id = "BPM_PROCESS_DEFINE.ID";

    /** Attribute */
    static final String LastEditorId = "BPM_PROCESS_DEFINE.LAST_EDITOR_ID";

    /** Attribute */
    static final String LastEditDate = "BPM_PROCESS_DEFINE.LAST_EDIT_DATE";

    /** Attribute */
    static final String ProcessKey = "BPM_PROCESS_DEFINE.PROCESS_KEY";

    /** Attribute */
    static final String ProcessName = "BPM_PROCESS_DEFINE.PROCESS_NAME";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_PROCESS_DEFINE.STATUS";

    /** Attribute */
    static final String CatalogId = "BPM_PROCESS_DEFINE.CATALOG_ID";

    /** Attribute */
    static final String ProcessVersion = "BPM_PROCESS_DEFINE.PROCESS_VERSION";

    /** Attribute */
    static final String LastEditorName = "sysUserA.USER_NAME";

    /** Attribute */
    static final String StartFormKey = "BPM_PROCESS_DEFINE.START_FORM_KEY";

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
        static final String LastEditorId = "lastEditorId";

        /** Attribute */
        static final String LastEditDate = "lastEditDate";

        /** Attribute */
        static final String ProcessKey = "processKey";

        /** Attribute */
        static final String ProcessName = "processName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String CatalogId = "catalogId";

        /** Attribute */
        static final String ProcessVersion = "processVersion";

        /** Attribute */
        static final String LastEditorName = "lastEditorName";

        /** Attribute */
        static final String StartFormKey = "startFormKey";
    } // end DataProperty

    /**
     * Check Unique BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessDefine aBpmProcessDefine)
        throws Exception;

    /**
     * insert BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessDefine(BpmProcessDefine aBpmProcessDefine)
        throws Exception;

    /**
     * Batch Insert BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessDefine(BpmProcessDefine[] aBpmProcessDefine)
        throws Exception;

    /**
     * Delete BpmProcessDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessDefine(final long aId) throws Exception;

    /**
     * Delete BpmProcessDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessDefine(BpmProcessDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessDefine(BpmProcessDefine aBpmProcessDefine)
        throws Exception;

    /**
     * Batch Modify BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessDefine(BpmProcessDefine[] aBpmProcessDefine)
        throws Exception;

    /**
     * Modify BpmProcessDefine  By Query Conditions
     *
     * @param aBpmProcessDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessDefine(BpmProcessDefine aBpmProcessDefine,
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessDefine findBpmProcessDefineById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessDefine
     *
     * @param aQueryBean
     *
     * @return IBpmProcessDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessDefine" containment="true"
     */
    BpmProcessDefine[] queryBpmProcessDefine(
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessDefine
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessDefine" containment="true"
     */

    //Map queryBpmProcessDefineForMap(BpmProcessDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessDefineCount(BpmProcessDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmProcessDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessDefineSelective(
        BpmProcessDefineDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessDefine
     *
     * @param aBpmProcessDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessDefine(BpmProcessDefine[] aBpmProcessDefines,
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessDefine
     *
     * @param aBpmProcessDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessDefine(BpmProcessDefine[] aBpmProcessDefines,
        BpmProcessDefineDAOQueryBean aQueryBean,
        BpmProcessDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessDefineArray DOCUMENT ME!
         * @param willUpdateBpmProcessDefineArray DOCUMENT ME!
         * @param willDeleteBpmProcessDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessDefine[] willAddBpmProcessDefineArray,
            BpmProcessDefine[] willUpdateBpmProcessDefineArray,
            BpmProcessDefine[] willDeleteBpmProcessDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessDefine[] aBpmProcessDefines)
            throws Exception;
    } // end BpmProcessDefineSynchronizeCallback
} // end IBaseBpmProcessDefineDAO
