/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessFormValue Data Access Object
*  GenDate 2011-11-28 15:45:28  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessFormValueDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_FORM_VALUE";

    /** Attribute */
    static final String Id = "BPM_PROCESS_FORM_VALUE.ID";

    /** Attribute */
    static final String DoubleValue = "BPM_PROCESS_FORM_VALUE.DOUBLE_VALUE";

    /** Attribute */
    static final String FormInstanceId = "BPM_PROCESS_FORM_VALUE.FORM_INSTANCE_ID";

    /** Attribute */
    static final String LongValue = "BPM_PROCESS_FORM_VALUE.LONG_VALUE";

    /** Attribute */
    static final String PropertyDataType = "BPM_PROCESS_FORM_VALUE.PROPERTY_DATA_TYPE";

    /** Attribute */
    static final String PropertyName = "BPM_PROCESS_FORM_VALUE.PROPERTY_NAME";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_FORM_VALUE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_PROCESS_FORM_VALUE.STATUS";

    /** Attribute */
    static final String StringValue = "BPM_PROCESS_FORM_VALUE.STRING_VALUE";

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
        static final String DoubleValue = "doubleValue";

        /** Attribute */
        static final String FormInstanceId = "formInstanceId";

        /** Attribute */
        static final String LongValue = "longValue";

        /** Attribute */
        static final String PropertyDataType = "propertyDataType";

        /** Attribute */
        static final String PropertyName = "propertyName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String StringValue = "stringValue";
    } // end DataProperty

    /**
     * Check Unique BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessFormValue aBpmProcessFormValue)
        throws Exception;

    /**
     * insert BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessFormValue(BpmProcessFormValue aBpmProcessFormValue)
        throws Exception;

    /**
     * Batch Insert BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValue) throws Exception;

    /**
     * Delete BpmProcessFormValue
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormValue(final long aId) throws Exception;

    /**
     * Delete BpmProcessFormValue By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormValue(BpmProcessFormValueDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessFormValue(BpmProcessFormValue aBpmProcessFormValue)
        throws Exception;

    /**
     * Batch Modify BpmProcessFormValue
     *
     * @param aBpmProcessFormValue
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValue) throws Exception;

    /**
     * Modify BpmProcessFormValue  By Query Conditions
     *
     * @param aBpmProcessFormValue Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessFormValue(BpmProcessFormValue aBpmProcessFormValue,
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessFormValue
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessFormValue findBpmProcessFormValueById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessFormValue
     *
     * @param aQueryBean
     *
     * @return IBpmProcessFormValue[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessFormValue" containment="true"
     */
    BpmProcessFormValue[] queryBpmProcessFormValue(
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessFormValue
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessFormValue[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessFormValue" containment="true"
     */

    //Map queryBpmProcessFormValueForMap(BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessFormValue
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessFormValueCount(
        BpmProcessFormValueDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmProcessFormValue Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessFormValueSelective(
        BpmProcessFormValueDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmProcessFormValue
     *
     * @param aBpmProcessFormValues
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValues,
        BpmProcessFormValueDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessFormValue
     *
     * @param aBpmProcessFormValues
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessFormValue(
        BpmProcessFormValue[] aBpmProcessFormValues,
        BpmProcessFormValueDAOQueryBean aQueryBean,
        BpmProcessFormValueSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessFormValueSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessFormValueArray DOCUMENT ME!
         * @param willUpdateBpmProcessFormValueArray DOCUMENT ME!
         * @param willDeleteBpmProcessFormValueArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessFormValue[] willAddBpmProcessFormValueArray,
            BpmProcessFormValue[] willUpdateBpmProcessFormValueArray,
            BpmProcessFormValue[] willDeleteBpmProcessFormValueArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormValues DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessFormValue[] aBpmProcessFormValues)
            throws Exception;
    } // end BpmProcessFormValueSynchronizeCallback
} // end IBaseBpmProcessFormValueDAO
