/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmFormFieldStatusDefine Data Access Object
*  GenDate 2011-11-01 13:19:52  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmFormFieldStatusDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_FORM_FIELD_STATUS_DEFINE";

    /** Attribute */
    static final String Id = "BPM_FORM_FIELD_STATUS_DEFINE.ID";

    /** Attribute */
    static final String BpmRoleId = "BPM_FORM_FIELD_STATUS_DEFINE.BPM_ROLE_ID";

    /** Attribute */
    static final String FieldDefineId = "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_DEFINE_ID";

    /** Attribute */
    static final String Remarks = "BPM_FORM_FIELD_STATUS_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_FORM_FIELD_STATUS_DEFINE.STATUS";

    /** Attribute */
    static final String StepDefineId = "BPM_FORM_FIELD_STATUS_DEFINE.STEP_DEFINE_ID";

    /** Attribute */
    static final String FieldStatus = "BPM_FORM_FIELD_STATUS_DEFINE.FIELD_STATUS";

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
        static final String BpmRoleId = "bpmRoleId";

        /** Attribute */
        static final String FieldDefineId = "fieldDefineId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String StepDefineId = "stepDefineId";

        /** Attribute */
        static final String FieldStatus = "fieldStatus";
    } // end DataProperty

    /**
     * Check Unique BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception;

    /**
     * insert BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception;

    /**
     * Batch Insert BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefine)
        throws Exception;

    /**
     * Delete BpmFormFieldStatusDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldStatusDefine(final long aId)
        throws Exception;

    /**
     * Delete BpmFormFieldStatusDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception;

    /**
     * Batch Modify BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefine)
        throws Exception;

    /**
     * Modify BpmFormFieldStatusDefine  By Query Conditions
     *
     * @param aBpmFormFieldStatusDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldStatusDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmFormFieldStatusDefine findBpmFormFieldStatusDefineById(final long aId)
        throws Exception;

    /**
     * Query BpmFormFieldStatusDefine
     *
     * @param aQueryBean
     *
     * @return IBpmFormFieldStatusDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldStatusDefine" containment="true"
     */
    BpmFormFieldStatusDefine[] queryBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldStatusDefine
     *
     * @param aBaseQueryBean
     *
     * @return IBpmFormFieldStatusDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldStatusDefine" containment="true"
     */

    //Map queryBpmFormFieldStatusDefineForMap(BpmFormFieldStatusDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmFormFieldStatusDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmFormFieldStatusDefineCount(
        BpmFormFieldStatusDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldStatusDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmFormFieldStatusDefineSelective(
        BpmFormFieldStatusDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean,
        BpmFormFieldStatusDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmFormFieldStatusDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmFormFieldStatusDefineArray DOCUMENT ME!
         * @param willUpdateBpmFormFieldStatusDefineArray DOCUMENT ME!
         * @param willDeleteBpmFormFieldStatusDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmFormFieldStatusDefine[] willAddBpmFormFieldStatusDefineArray,
            BpmFormFieldStatusDefine[] willUpdateBpmFormFieldStatusDefineArray,
            BpmFormFieldStatusDefine[] willDeleteBpmFormFieldStatusDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldStatusDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines)
            throws Exception;
    } // end BpmFormFieldStatusDefineSynchronizeCallback
} // end IBaseBpmFormFieldStatusDefineDAO
