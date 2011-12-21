/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmTaskRoleRelate Data Access Object
*  GenDate 2011-11-30 15:28:13  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmTaskRoleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_TASK_ROLE_RELATE";

    /** Attribute */
    static final String Id = "BPM_TASK_ROLE_RELATE.ID";

    /** Attribute */
    static final String Remarks = "BPM_TASK_ROLE_RELATE.REMARKS";

    /** Attribute */
    static final String RoleId = "BPM_TASK_ROLE_RELATE.ROLE_ID";

    /** Attribute */
    static final String Status = "BPM_TASK_ROLE_RELATE.STATUS";

    /** Attribute */
    static final String TaskId = "BPM_TASK_ROLE_RELATE.TASK_ID";

    /** Attribute */
    static final String ProcessInstanceId = "bpmTaskG.PROCESS_INSTANCE_ID";

    /** Attribute */
    static final String TaskName = "bpmTaskG.TASK_NAME";

    /** Attribute */
    static final String TaskSerialNumber = "bpmTaskG.SERIAL_NUMBER";

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
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleId = "roleId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TaskId = "taskId";

        /** Attribute */
        static final String ProcessInstanceId = "processInstanceId";

        /** Attribute */
        static final String TaskName = "taskName";

        /** Attribute */
        static final String TaskSerialNumber = "taskSerialNumber";
    } // end DataProperty

    /**
     * Check Unique BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception;

    /**
     * insert BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception;

    /**
     * Batch Insert BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmTaskRoleRelate(BpmTaskRoleRelate[] aBpmTaskRoleRelate)
        throws Exception;

    /**
     * Delete BpmTaskRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmTaskRoleRelate(final long aId) throws Exception;

    /**
     * Delete BpmTaskRoleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmTaskRoleRelate(BpmTaskRoleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception;

    /**
     * Batch Modify BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmTaskRoleRelate(BpmTaskRoleRelate[] aBpmTaskRoleRelate)
        throws Exception;

    /**
     * Modify BpmTaskRoleRelate  By Query Conditions
     *
     * @param aBpmTaskRoleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate,
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmTaskRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmTaskRoleRelate findBpmTaskRoleRelateById(final long aId)
        throws Exception;

    /**
     * Query BpmTaskRoleRelate
     *
     * @param aQueryBean
     *
     * @return IBpmTaskRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmTaskRoleRelate" containment="true"
     */
    BpmTaskRoleRelate[] queryBpmTaskRoleRelate(
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmTaskRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return IBpmTaskRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="IBpmTaskRoleRelate" containment="true"
     */

    //Map queryBpmTaskRoleRelateForMap(BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmTaskRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmTaskRoleRelateCount(
        BpmTaskRoleRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query BpmTaskRoleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmTaskRoleRelateSelective(
        BpmTaskRoleRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmTaskRoleRelate(BpmTaskRoleRelate[] aBpmTaskRoleRelates,
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmTaskRoleRelate(BpmTaskRoleRelate[] aBpmTaskRoleRelates,
        BpmTaskRoleRelateDAOQueryBean aQueryBean,
        BpmTaskRoleRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmTaskRoleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmTaskRoleRelateArray DOCUMENT ME!
         * @param willUpdateBpmTaskRoleRelateArray DOCUMENT ME!
         * @param willDeleteBpmTaskRoleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmTaskRoleRelate[] willAddBpmTaskRoleRelateArray,
            BpmTaskRoleRelate[] willUpdateBpmTaskRoleRelateArray,
            BpmTaskRoleRelate[] willDeleteBpmTaskRoleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmTaskRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmTaskRoleRelate[] aBpmTaskRoleRelates)
            throws Exception;
    } // end BpmTaskRoleRelateSynchronizeCallback
} // end IBaseBpmTaskRoleRelateDAO
