/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessInstance Data Access Object
*  GenDate 2011-11-25 15:17:21  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessInstanceDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_INSTANCE";

    /** Attribute */
    static final String Id = "BPM_PROCESS_INSTANCE.ID";

    /** Attribute */
    static final String CompleteDate = "BPM_PROCESS_INSTANCE.COMPLETE_DATE";

    /** Attribute */
    static final String ProcessDefineId = "BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_INSTANCE.REMARKS";

    /** Attribute */
    static final String StarterId = "BPM_PROCESS_INSTANCE.STARTER_ID";

    /** Attribute */
    static final String StartDate = "BPM_PROCESS_INSTANCE.START_DATE";

    /** Attribute */
    static final String Status = "BPM_PROCESS_INSTANCE.STATUS";

    /** Attribute */
    static final String ProcessName = "bpmProcessDefineE.PROCESS_NAME";

    /** Attribute */
    static final String ProcessKey = "bpmProcessDefineE.PROCESS_KEY";

    /** Attribute */
    static final String StarterName = "employeeE.NAME";

    /** Attribute */
    static final String StarterCode = "employeeE.CODE";

    /** Attribute */
    static final String InstanceId = "BPM_PROCESS_INSTANCE.INSTANCE_ID";

    /** Attribute */
    static final String SerialNumber = "BPM_PROCESS_INSTANCE.SERIAL_NUMBER";

    /** Attribute */
    static final String LastOperatorId = "BPM_PROCESS_INSTANCE.LAST_OPERATOR_ID";

    /** Attribute */
    static final String CommentCount = "BPM_PROCESS_INSTANCE.COMMENT_COUNT";

    /** Attribute */
    static final String AttachmentCount = "BPM_PROCESS_INSTANCE.ATTACHMENT_COUNT";

    /** Attribute */
    static final String StartFormKey = "BPM_PROCESS_INSTANCE.START_FORM_KEY";

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
        static final String CompleteDate = "completeDate";

        /** Attribute */
        static final String ProcessDefineId = "processDefineId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String StarterId = "starterId";

        /** Attribute */
        static final String StartDate = "startDate";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ProcessName = "processName";

        /** Attribute */
        static final String ProcessKey = "processKey";

        /** Attribute */
        static final String StarterName = "starterName";

        /** Attribute */
        static final String StarterCode = "starterCode";

        /** Attribute */
        static final String InstanceId = "instanceId";

        /** Attribute */
        static final String SerialNumber = "serialNumber";

        /** Attribute */
        static final String LastOperatorId = "lastOperatorId";

        /** Attribute */
        static final String CommentCount = "commentCount";

        /** Attribute */
        static final String AttachmentCount = "attachmentCount";

        /** Attribute */
        static final String StartFormKey = "startFormKey";
    } // end DataProperty

    /**
     * Check Unique BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessInstance aBpmProcessInstance)
        throws Exception;

    /**
     * insert BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessInstance(BpmProcessInstance aBpmProcessInstance)
        throws Exception;

    /**
     * Batch Insert BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessInstance(BpmProcessInstance[] aBpmProcessInstance)
        throws Exception;

    /**
     * Delete BpmProcessInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessInstance(final long aId) throws Exception;

    /**
     * Delete BpmProcessInstance By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessInstance(BpmProcessInstanceDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessInstance(BpmProcessInstance aBpmProcessInstance)
        throws Exception;

    /**
     * Batch Modify BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessInstance(BpmProcessInstance[] aBpmProcessInstance)
        throws Exception;

    /**
     * Modify BpmProcessInstance  By Query Conditions
     *
     * @param aBpmProcessInstance Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessInstance(BpmProcessInstance aBpmProcessInstance,
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessInstance findBpmProcessInstanceById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessInstance
     *
     * @param aQueryBean
     *
     * @return IBpmProcessInstance[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessInstance" containment="true"
     */
    BpmProcessInstance[] queryBpmProcessInstance(
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessInstance
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessInstance[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessInstance" containment="true"
     */

    //Map queryBpmProcessInstanceForMap(BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessInstance
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessInstanceCount(
        BpmProcessInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmProcessInstance Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessInstanceSelective(
        BpmProcessInstanceDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmProcessInstance
     *
     * @param aBpmProcessInstances
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstances,
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessInstance
     *
     * @param aBpmProcessInstances
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstances,
        BpmProcessInstanceDAOQueryBean aQueryBean,
        BpmProcessInstanceSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessInstanceSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessInstanceArray DOCUMENT ME!
         * @param willUpdateBpmProcessInstanceArray DOCUMENT ME!
         * @param willDeleteBpmProcessInstanceArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessInstance[] willAddBpmProcessInstanceArray,
            BpmProcessInstance[] willUpdateBpmProcessInstanceArray,
            BpmProcessInstance[] willDeleteBpmProcessInstanceArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessInstances DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessInstance[] aBpmProcessInstances)
            throws Exception;
    } // end BpmProcessInstanceSynchronizeCallback
} // end IBaseBpmProcessInstanceDAO
