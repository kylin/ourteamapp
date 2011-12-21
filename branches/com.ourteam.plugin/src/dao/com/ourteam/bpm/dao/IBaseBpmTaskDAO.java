/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmTask Data Access Object
*  GenDate 2011-11-30 15:28:42  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmTaskDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_TASK";

    /** Attribute */
    static final String Id = "BPM_TASK.ID";

    /** Attribute */
    static final String AssignerId = "BPM_TASK.ASSIGNER_ID";

    /** Attribute */
    static final String EndDateTime = "BPM_TASK.END_DATE_TIME";

    /** Attribute */
    static final String Priority = "BPM_TASK.PRIORITY";

    /** Attribute */
    static final String ProcessInstanceId = "BPM_TASK.PROCESS_INSTANCE_ID";

    /** Attribute */
    static final String Remarks = "BPM_TASK.REMARKS";

    /** Attribute */
    static final String StartDateTime = "BPM_TASK.START_DATE_TIME";

    /** Attribute */
    static final String Status = "BPM_TASK.STATUS";

    /** Attribute */
    static final String TaskKey = "BPM_TASK.TASK_KEY";

    /** Attribute */
    static final String TaskName = "BPM_TASK.TASK_NAME";

    /** Attribute */
    static final String ProcessDefineId = "bpmProcessInstanceF.PROCESS_DEFINE_ID";

    /** Attribute */
    static final String ProcessName = "bpmProcessDefineF.PROCESS_NAME";

    /** Attribute */
    static final String AssignerName = "employeeF.NAME";

    /** Attribute */
    static final String StarterId = "BPM_TASK.STARTER_ID";

    /** Attribute */
    static final String SerialNumber = "BPM_TASK.SERIAL_NUMBER";

    /** Attribute */
    static final String CommentCount = "BPM_TASK.COMMENT_COUNT";

    /** Attribute */
    static final String AttachmentCount = "BPM_TASK.ATTACHMENT_COUNT";

    /** Attribute */
    static final String TaskFormKey = "BPM_TASK.TASK_FORM_KEY";

    /** Attribute */
    static final String ProcessFormKey = "bpmProcessInstanceF.START_FORM_KEY";

    /** Attribute */
    static final String PreTaskId = "BPM_TASK.PRE_TASK_ID";

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
        static final String AssignerId = "assignerId";

        /** Attribute */
        static final String EndDateTime = "endDateTime";

        /** Attribute */
        static final String Priority = "priority";

        /** Attribute */
        static final String ProcessInstanceId = "processInstanceId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String StartDateTime = "startDateTime";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TaskKey = "taskKey";

        /** Attribute */
        static final String TaskName = "taskName";

        /** Attribute */
        static final String ProcessDefineId = "processDefineId";

        /** Attribute */
        static final String ProcessName = "processName";

        /** Attribute */
        static final String AssignerName = "assignerName";

        /** Attribute */
        static final String StarterId = "starterId";

        /** Attribute */
        static final String SerialNumber = "serialNumber";

        /** Attribute */
        static final String CommentCount = "commentCount";

        /** Attribute */
        static final String AttachmentCount = "attachmentCount";

        /** Attribute */
        static final String TaskFormKey = "taskFormKey";

        /** Attribute */
        static final String ProcessFormKey = "processFormKey";

        /** Attribute */
        static final String PreTaskId = "preTaskId";
    } // end DataProperty

    /**
     * Check Unique BpmTask
     *
     * @param aBpmTask
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmTask aBpmTask) throws Exception;

    /**
     * insert BpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmTask(BpmTask aBpmTask) throws Exception;

    /**
     * Batch Insert BpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmTask(BpmTask[] aBpmTask) throws Exception;

    /**
     * Delete BpmTask
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmTask(final long aId) throws Exception;

    /**
     * Delete BpmTask By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmTask(BpmTaskDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmTask(BpmTask aBpmTask) throws Exception;

    /**
     * Batch Modify BpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmTask(BpmTask[] aBpmTask) throws Exception;

    /**
     * Modify BpmTask  By Query Conditions
     *
     * @param aBpmTask Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmTask(BpmTask aBpmTask, BpmTaskDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmTask
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmTask findBpmTaskById(final long aId) throws Exception;

    /**
     * Query BpmTask
     *
     * @param aQueryBean
     *
     * @return IBpmTask[]
     *
     * @throws Exception
     *
     * @model type="IBpmTask" containment="true"
     */
    BpmTask[] queryBpmTask(BpmTaskDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmTask
     *
     * @param aBaseQueryBean
     *
     * @return IBpmTask[]
     *
     * @throws Exception
     *
     * @model type="IBpmTask" containment="true"
     */

    //Map queryBpmTaskForMap(BpmTaskDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmTask
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmTaskCount(BpmTaskDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmTask Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmTaskSelective(BpmTaskDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmTask
     *
     * @param aBpmTasks
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmTask(BpmTask[] aBpmTasks, BpmTaskDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmTask
     *
     * @param aBpmTasks
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmTask(BpmTask[] aBpmTasks,
        BpmTaskDAOQueryBean aQueryBean, BpmTaskSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmTaskSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmTaskArray DOCUMENT ME!
         * @param willUpdateBpmTaskArray DOCUMENT ME!
         * @param willDeleteBpmTaskArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(BpmTask[] willAddBpmTaskArray,
            BpmTask[] willUpdateBpmTaskArray, BpmTask[] willDeleteBpmTaskArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmTask[] aBpmTasks) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmTask[] aBpmTasks) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmTask[] aBpmTasks) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmTask[] aBpmTasks) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmTask[] aBpmTasks) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTasks DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmTask[] aBpmTasks) throws Exception;
    } // end BpmTaskSynchronizeCallback
} // end IBaseBpmTaskDAO
