/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareToolInputLog Data Access Object
*  GenDate 2011-12-09 08:49:12  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolInputLogDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL_INPUT_LOG";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL_INPUT_LOG.ID";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL_INPUT_LOG.REMARKS";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL_INPUT_LOG.STATUS";

    /** Attribute */
    static final String ToolInputId = "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID";

    /** Attribute */
    static final String ToolInputValue = "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_VALUE";

    /** Attribute */
    static final String ToolLogId = "MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID";

    /** Attribute */
    static final String ParameterName = "toolInputD.PARAMETER_NAME";

    /** Attribute */
    static final String ParameterCode = "toolInputD.PARAMETER_CODE";

    /** Attribute */
    static final String ParameterType = "toolInputD.PARAMETER_TYPE";

    /** Attribute */
    static final String SortIndex = "toolInputD.SORT_INDEX";

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
        static final String Status = "status";

        /** Attribute */
        static final String ToolInputId = "toolInputId";

        /** Attribute */
        static final String ToolInputValue = "toolInputValue";

        /** Attribute */
        static final String ToolLogId = "toolLogId";

        /** Attribute */
        static final String ParameterName = "parameterName";

        /** Attribute */
        static final String ParameterCode = "parameterCode";

        /** Attribute */
        static final String ParameterType = "parameterType";

        /** Attribute */
        static final String SortIndex = "sortIndex";
    } // end DataProperty

    /**
     * Check Unique MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception;

    /**
     * insert MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception;

    /**
     * Batch Insert MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLog)
        throws Exception;

    /**
     * Delete MiddleWareToolInputLog
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputLog(final long aId) throws Exception;

    /**
     * Delete MiddleWareToolInputLog By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputLog(
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception;

    /**
     * Batch Modify MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLog)
        throws Exception;

    /**
     * Modify MiddleWareToolInputLog  By Query Conditions
     *
     * @param aMiddleWareToolInputLog Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog,
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareToolInputLog findMiddleWareToolInputLogById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareToolInputLog
     *
     * @param aQueryBean
     *
     * @return IMiddleWareToolInputLog[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputLog" containment="true"
     */
    MiddleWareToolInputLog[] queryMiddleWareToolInputLog(
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputLog
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareToolInputLog[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputLog" containment="true"
     */

    //Map queryMiddleWareToolInputLogForMap(MiddleWareToolInputLogDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareToolInputLog
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolInputLogCount(
        MiddleWareToolInputLogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputLog Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolInputLogSelective(
        MiddleWareToolInputLogDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLogs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLogs,
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLogs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLogs,
        MiddleWareToolInputLogDAOQueryBean aQueryBean,
        MiddleWareToolInputLogSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolInputLogSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolInputLogArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolInputLogArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolInputLogArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareToolInputLog[] willAddMiddleWareToolInputLogArray,
            MiddleWareToolInputLog[] willUpdateMiddleWareToolInputLogArray,
            MiddleWareToolInputLog[] willDeleteMiddleWareToolInputLogArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputLogs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareToolInputLog[] aMiddleWareToolInputLogs)
            throws Exception;
    } // end MiddleWareToolInputLogSynchronizeCallback
} // end IBaseMiddleWareToolInputLogDAO
