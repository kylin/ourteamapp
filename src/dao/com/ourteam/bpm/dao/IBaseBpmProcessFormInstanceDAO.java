/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessFormInstance Data Access Object
*  GenDate 2011-11-28 15:45:02  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessFormInstanceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_FORM_INSTANCE";

    /** Attribute */
    static final String Id = "BPM_PROCESS_FORM_INSTANCE.ID";

    /** Attribute */
    static final String FormKey = "BPM_PROCESS_FORM_INSTANCE.FORM_KEY";

    /** Attribute */
    static final String FormXml = "BPM_PROCESS_FORM_INSTANCE.FORM_XML";

    /** Attribute */
    static final String ProcessInstanceId = "BPM_PROCESS_FORM_INSTANCE.PROCESS_INSTANCE_ID";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_FORM_INSTANCE.REMARKS";

    /** Attribute */
    static final String Status = "BPM_PROCESS_FORM_INSTANCE.STATUS";

    /** Attribute */
    static final String TaskId = "BPM_PROCESS_FORM_INSTANCE.TASK_ID";

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
        static final String FormXml = "formXml";

        /** Attribute */
        static final String ProcessInstanceId = "processInstanceId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TaskId = "taskId";
    } // end DataProperty

    /**
     * Check Unique BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception;

    /**
     * insert BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception;

    /**
     * Batch Insert BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstance)
        throws Exception;

    /**
     * Delete BpmProcessFormInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormInstance(final long aId) throws Exception;

    /**
     * Delete BpmProcessFormInstance By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessFormInstance(
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception;

    /**
     * Batch Modify BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstance)
        throws Exception;

    /**
     * Modify BpmProcessFormInstance  By Query Conditions
     *
     * @param aBpmProcessFormInstance Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance,
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmProcessFormInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessFormInstance findBpmProcessFormInstanceById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessFormInstance
     *
     * @param aQueryBean
     *
     * @return IBpmProcessFormInstance[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessFormInstance" containment="true"
     */
    BpmProcessFormInstance[] queryBpmProcessFormInstance(
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmProcessFormInstance
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessFormInstance[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessFormInstance" containment="true"
     */

    //Map queryBpmProcessFormInstanceForMap(BpmProcessFormInstanceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessFormInstance
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessFormInstanceCount(
        BpmProcessFormInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmProcessFormInstance Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessFormInstanceSelective(
        BpmProcessFormInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstances
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstances,
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstances
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstances,
        BpmProcessFormInstanceDAOQueryBean aQueryBean,
        BpmProcessFormInstanceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessFormInstanceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessFormInstanceArray DOCUMENT ME!
         * @param willUpdateBpmProcessFormInstanceArray DOCUMENT ME!
         * @param willDeleteBpmProcessFormInstanceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessFormInstance[] willAddBpmProcessFormInstanceArray,
            BpmProcessFormInstance[] willUpdateBpmProcessFormInstanceArray,
            BpmProcessFormInstance[] willDeleteBpmProcessFormInstanceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessFormInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessFormInstance[] aBpmProcessFormInstances)
            throws Exception;
    } // end BpmProcessFormInstanceSynchronizeCallback
} // end IBaseBpmProcessFormInstanceDAO
