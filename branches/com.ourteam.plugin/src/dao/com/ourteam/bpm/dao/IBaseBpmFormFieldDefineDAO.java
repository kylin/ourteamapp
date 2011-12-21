/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmFormFieldDefine Data Access Object
*  GenDate 2011-11-11 13:31:05  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmFormFieldDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_FORM_FIELD_DEFINE";

    /** Attribute */
    static final String Id = "BPM_FORM_FIELD_DEFINE.ID";

    /** Attribute */
    static final String FieldKey = "BPM_FORM_FIELD_DEFINE.FIELD_KEY";

    /** Attribute */
    static final String FieldName = "BPM_FORM_FIELD_DEFINE.FIELD_NAME";

    /** Attribute */
    static final String FieldType = "BPM_FORM_FIELD_DEFINE.FIELD_TYPE";

    /** Attribute */
    static final String FormDefineId = "BPM_FORM_FIELD_DEFINE.FORM_DEFINE_ID";

    /** Attribute */
    static final String ParentFieldId = "BPM_FORM_FIELD_DEFINE.PARENT_FIELD_ID";

    /** Attribute */
    static final String Remarks = "BPM_FORM_FIELD_DEFINE.REMARKS";

    /** Attribute */
    static final String SortIndex = "BPM_FORM_FIELD_DEFINE.SORT_INDEX";

    /** Attribute */
    static final String Status = "BPM_FORM_FIELD_DEFINE.STATUS";

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
        static final String FieldKey = "fieldKey";

        /** Attribute */
        static final String FieldName = "fieldName";

        /** Attribute */
        static final String FieldType = "fieldType";

        /** Attribute */
        static final String FormDefineId = "formDefineId";

        /** Attribute */
        static final String ParentFieldId = "parentFieldId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception;

    /**
     * insert BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmFormFieldDefine(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception;

    /**
     * Batch Insert BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmFormFieldDefine(BpmFormFieldDefine[] aBpmFormFieldDefine)
        throws Exception;

    /**
     * Delete BpmFormFieldDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldDefine(final long aId) throws Exception;

    /**
     * Delete BpmFormFieldDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmFormFieldDefine(BpmFormFieldDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldDefine(BpmFormFieldDefine aBpmFormFieldDefine)
        throws Exception;

    /**
     * Batch Modify BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmFormFieldDefine(BpmFormFieldDefine[] aBpmFormFieldDefine)
        throws Exception;

    /**
     * Modify BpmFormFieldDefine  By Query Conditions
     *
     * @param aBpmFormFieldDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmFormFieldDefine(BpmFormFieldDefine aBpmFormFieldDefine,
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmFormFieldDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmFormFieldDefine findBpmFormFieldDefineById(final long aId)
        throws Exception;

    /**
     * Query BpmFormFieldDefine
     *
     * @param aQueryBean
     *
     * @return IBpmFormFieldDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldDefine" containment="true"
     */
    BpmFormFieldDefine[] queryBpmFormFieldDefine(
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmFormFieldDefine
     *
     * @param aBaseQueryBean
     *
     * @return IBpmFormFieldDefine[]
     *
     * @throws Exception
     *
     * @model type="IBpmFormFieldDefine" containment="true"
     */

    //Map queryBpmFormFieldDefineForMap(BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmFormFieldDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmFormFieldDefineCount(
        BpmFormFieldDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmFormFieldDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmFormFieldDefineSelective(
        BpmFormFieldDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefines,
        BpmFormFieldDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmFormFieldDefine
     *
     * @param aBpmFormFieldDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmFormFieldDefine(
        BpmFormFieldDefine[] aBpmFormFieldDefines,
        BpmFormFieldDefineDAOQueryBean aQueryBean,
        BpmFormFieldDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmFormFieldDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmFormFieldDefineArray DOCUMENT ME!
         * @param willUpdateBpmFormFieldDefineArray DOCUMENT ME!
         * @param willDeleteBpmFormFieldDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmFormFieldDefine[] willAddBpmFormFieldDefineArray,
            BpmFormFieldDefine[] willUpdateBpmFormFieldDefineArray,
            BpmFormFieldDefine[] willDeleteBpmFormFieldDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmFormFieldDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmFormFieldDefine[] aBpmFormFieldDefines)
            throws Exception;
    } // end BpmFormFieldDefineSynchronizeCallback
} // end IBaseBpmFormFieldDefineDAO
