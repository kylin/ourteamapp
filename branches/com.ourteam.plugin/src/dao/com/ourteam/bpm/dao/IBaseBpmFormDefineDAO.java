/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmFormDefine Data Access Object
*  GenDate 2011-11-11 14:51:15  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmFormDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_FORM_DEFINE";

    /** Attribute */
    static final String Id = "BPM_FORM_DEFINE.ID";

    /** Attribute */
    static final String FormKey = "BPM_FORM_DEFINE.FORM_KEY";

    /** Attribute */
    static final String FormName = "BPM_FORM_DEFINE.FORM_NAME";

    /** Attribute */
    static final String ProcessDefineId = "BPM_FORM_DEFINE.PROCESS_DEFINE_ID";

    /** Attribute */
    static final String Remarks = "BPM_FORM_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_FORM_DEFINE.STATUS";

    /** Attribute */
    static final String FormXml = "BPM_FORM_DEFINE.FORM_XML";

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
        static final String FormKey = "formKey";

        /** Attribute */
        static final String FormName = "formName";

        /** Attribute */
        static final String ProcessDefineId = "processDefineId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String FormXml = "formXml";
    } // end DataProperty

    /**
     * Check Unique BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmFormDefine aBpmFormDefine)
        throws Exception;

    /**
     * insert BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmFormDefine(BpmFormDefine aBpmFormDefine)
        throws Exception;

    /**
     * Batch Insert BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmFormDefine(BpmFormDefine[] aBpmFormDefine)
        throws Exception;

    /**
     * Delete BpmFormDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormDefine(final long aId) throws Exception;

    /**
     * Delete BpmFormDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormDefine(BpmFormDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormDefine(BpmFormDefine aBpmFormDefine)
        throws Exception;

    /**
     * Batch Modify BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmFormDefine(BpmFormDefine[] aBpmFormDefine)
        throws Exception;

    /**
     * Modify BpmFormDefine  By Query Conditions
     *
     * @param aBpmFormDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormDefine(BpmFormDefine aBpmFormDefine,
        BpmFormDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmFormDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmFormDefine findBpmFormDefineById(final long aId)
        throws Exception;

    /**
     * Query BpmFormDefine
     *
     * @param aQueryBean
     *
     * @return IBpmFormDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormDefine" containment="true"
     */
    BpmFormDefine[] queryBpmFormDefine(BpmFormDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmFormDefine
     *
     * @param aBaseQueryBean
     *
     * @return IBpmFormDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormDefine" containment="true"
     */

    //Map queryBpmFormDefineForMap(BpmFormDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmFormDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmFormDefineCount(BpmFormDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmFormDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmFormDefineSelective(BpmFormDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormDefine
     *
     * @param aBpmFormDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormDefine(BpmFormDefine[] aBpmFormDefines,
        BpmFormDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmFormDefine
     *
     * @param aBpmFormDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormDefine(BpmFormDefine[] aBpmFormDefines,
        BpmFormDefineDAOQueryBean aQueryBean,
        BpmFormDefineSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmFormDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmFormDefineArray DOCUMENT ME!
         * @param willUpdateBpmFormDefineArray DOCUMENT ME!
         * @param willDeleteBpmFormDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmFormDefine[] willAddBpmFormDefineArray,
            BpmFormDefine[] willUpdateBpmFormDefineArray,
            BpmFormDefine[] willDeleteBpmFormDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmFormDefine[] aBpmFormDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmFormDefine[] aBpmFormDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmFormDefine[] aBpmFormDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmFormDefine[] aBpmFormDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmFormDefine[] aBpmFormDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmFormDefine[] aBpmFormDefines)
            throws Exception;
    } // end BpmFormDefineSynchronizeCallback
} // end IBaseBpmFormDefineDAO
