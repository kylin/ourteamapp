/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareToolLog Data Access Object
*  GenDate 2011-12-09 11:52:52  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolLogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL_LOG";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL_LOG.ID";

    /** Attribute */
    static final String ExecuteFinishTime = "MIDDLE_WARE_TOOL_LOG.EXECUTE_FINISH_TIME";

    /** Attribute */
    static final String ExecuteLog = "MIDDLE_WARE_TOOL_LOG.EXECUTE_LOG";

    /** Attribute */
    static final String ExecuteResult = "MIDDLE_WARE_TOOL_LOG.EXECUTE_RESULT";

    /** Attribute */
    static final String ExecuteStartTime = "MIDDLE_WARE_TOOL_LOG.EXECUTE_START_TIME";

    /** Attribute */
    static final String ExecutorId = "MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID";

    /** Attribute */
    static final String MiddleWareId = "MIDDLE_WARE_TOOL_LOG.MIDDLE_WARE_ID";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL_LOG.REMARKS";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL_LOG.STATUS";

    /** Attribute */
    static final String ToolId = "MIDDLE_WARE_TOOL_LOG.TOOL_ID";

    /** Attribute */
    static final String ExecutorName = "employeeC.NAME";

    /** Attribute */
    static final String ExecuteScript = "MIDDLE_WARE_TOOL_LOG.EXECUTE_SCRIPT";

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
        static final String ExecuteFinishTime = "executeFinishTime";

        /** Attribute */
        static final String ExecuteLog = "executeLog";

        /** Attribute */
        static final String ExecuteResult = "executeResult";

        /** Attribute */
        static final String ExecuteStartTime = "executeStartTime";

        /** Attribute */
        static final String ExecutorId = "executorId";

        /** Attribute */
        static final String MiddleWareId = "middleWareId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ToolId = "toolId";

        /** Attribute */
        static final String ExecutorName = "executorName";

        /** Attribute */
        static final String ExecuteScript = "executeScript";
    } // end DataProperty

    /**
     * Check Unique MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception;

    /**
     * insert MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception;

    /**
     * Batch Insert MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareToolLog(MiddleWareToolLog[] aMiddleWareToolLog)
        throws Exception;

    /**
     * Delete MiddleWareToolLog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolLog(final long aId) throws Exception;

    /**
     * Delete MiddleWareToolLog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolLog(MiddleWareToolLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception;

    /**
     * Batch Modify MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareToolLog(MiddleWareToolLog[] aMiddleWareToolLog)
        throws Exception;

    /**
     * Modify MiddleWareToolLog  By Query Conditions
     *
     * @param aMiddleWareToolLog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareToolLog findMiddleWareToolLogById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareToolLog
     *
     * @param aQueryBean
     *
     * @return IMiddleWareToolLog[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolLog" containment="true"
     */
    MiddleWareToolLog[] queryMiddleWareToolLog(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolLog
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareToolLog[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolLog" containment="true"
     */

    //Map queryMiddleWareToolLogForMap(MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareToolLog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolLogCount(
        MiddleWareToolLogDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query MiddleWareToolLog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolLogSelective(
        MiddleWareToolLogDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareToolLog
     *
     * @param aMiddleWareToolLogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolLog(MiddleWareToolLog[] aMiddleWareToolLogs,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareToolLog
     *
     * @param aMiddleWareToolLogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolLog(MiddleWareToolLog[] aMiddleWareToolLogs,
        MiddleWareToolLogDAOQueryBean aQueryBean,
        MiddleWareToolLogSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolLogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolLogArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolLogArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolLogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareToolLog[] willAddMiddleWareToolLogArray,
            MiddleWareToolLog[] willUpdateMiddleWareToolLogArray,
            MiddleWareToolLog[] willDeleteMiddleWareToolLogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareToolLog[] aMiddleWareToolLogs)
            throws Exception;
    } // end MiddleWareToolLogSynchronizeCallback

    /**
     * Query Related IMiddleWareToolInputLog
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputLog" containment="true"
     */
    com.ourteam.middleware.dao.MiddleWareToolInputLog[] queryMiddleWareToolInputLogs(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IMiddleWareToolInputLog to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputLog" containment="true"
     */

    //Map queryMiddleWareToolInputLogsForMap(MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IMiddleWareToolInputLog Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryMiddleWareToolInputLogsSelective(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputLog(
        com.ourteam.middleware.dao.MiddleWareToolInputLog aMiddleWareToolInputLog,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IMiddleWareToolInputLog
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputLog(MiddleWareToolLogDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseMiddleWareToolLogDAO
