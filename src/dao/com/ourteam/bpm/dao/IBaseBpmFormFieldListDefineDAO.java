/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmFormFieldListDefine Data Access Object
*  GenDate 2011-11-01 13:19:51  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmFormFieldListDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_FORM_FIELD_LIST_DEFINE";

    /** Attribute */
    static final String Id = "BPM_FORM_FIELD_LIST_DEFINE.ID";

    /** Attribute */
    static final String FieldId = "BPM_FORM_FIELD_LIST_DEFINE.FIELD_ID";

    /** Attribute */
    static final String ListKey = "BPM_FORM_FIELD_LIST_DEFINE.LIST_KEY";

    /** Attribute */
    static final String ListName = "BPM_FORM_FIELD_LIST_DEFINE.LIST_NAME";

    /** Attribute */
    static final String ListType = "BPM_FORM_FIELD_LIST_DEFINE.LIST_TYPE";

    /** Attribute */
    static final String Remarks = "BPM_FORM_FIELD_LIST_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_FORM_FIELD_LIST_DEFINE.STATUS";

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
        static final String FieldId = "fieldId";

        /** Attribute */
        static final String ListKey = "listKey";

        /** Attribute */
        static final String ListName = "listName";

        /** Attribute */
        static final String ListType = "listType";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception;

    /**
     * insert BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception;

    /**
     * Batch Insert BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefine)
        throws Exception;

    /**
     * Delete BpmFormFieldListDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldListDefine(final long aId) throws Exception;

    /**
     * Delete BpmFormFieldListDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldListDefine(
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine)
        throws Exception;

    /**
     * Batch Modify BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefine)
        throws Exception;

    /**
     * Modify BpmFormFieldListDefine  By Query Conditions
     *
     * @param aBpmFormFieldListDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldListDefine(
        BpmFormFieldListDefine aBpmFormFieldListDefine,
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldListDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmFormFieldListDefine findBpmFormFieldListDefineById(final long aId)
        throws Exception;

    /**
     * Query BpmFormFieldListDefine
     *
     * @param aQueryBean
     *
     * @return IBpmFormFieldListDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldListDefine" containment="true"
     */
    BpmFormFieldListDefine[] queryBpmFormFieldListDefine(
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldListDefine
     *
     * @param aBaseQueryBean
     *
     * @return IBpmFormFieldListDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldListDefine" containment="true"
     */

    //Map queryBpmFormFieldListDefineForMap(BpmFormFieldListDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmFormFieldListDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmFormFieldListDefineCount(
        BpmFormFieldListDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldListDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmFormFieldListDefineSelective(
        BpmFormFieldListDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefines,
        BpmFormFieldListDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormFieldListDefine
     *
     * @param aBpmFormFieldListDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldListDefine(
        BpmFormFieldListDefine[] aBpmFormFieldListDefines,
        BpmFormFieldListDefineDAOQueryBean aQueryBean,
        BpmFormFieldListDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmFormFieldListDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmFormFieldListDefineArray DOCUMENT ME!
         * @param willUpdateBpmFormFieldListDefineArray DOCUMENT ME!
         * @param willDeleteBpmFormFieldListDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmFormFieldListDefine[] willAddBpmFormFieldListDefineArray,
            BpmFormFieldListDefine[] willUpdateBpmFormFieldListDefineArray,
            BpmFormFieldListDefine[] willDeleteBpmFormFieldListDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldListDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmFormFieldListDefine[] aBpmFormFieldListDefines)
            throws Exception;
    } // end BpmFormFieldListDefineSynchronizeCallback
} // end IBaseBpmFormFieldListDefineDAO
