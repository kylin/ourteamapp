/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareTool Data Access Object
*  GenDate 2011-12-17 17:30:54  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL.ID";

    /** Attribute */
    static final String CompleteKeyWork = "MIDDLE_WARE_TOOL.COMPLETE_KEY_WORK";

    /** Attribute */
    static final String InputForm = "MIDDLE_WARE_TOOL.INPUT_FORM";

    /** Attribute */
    static final String OutputFile = "MIDDLE_WARE_TOOL.OUTPUT_FILE";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL.REMARKS";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL.STATUS";

    /** Attribute */
    static final String SucceedKeyWork = "MIDDLE_WARE_TOOL.SUCCEED_KEY_WORK";

    /** Attribute */
    static final String TimeOut = "MIDDLE_WARE_TOOL.TIME_OUT";

    /** Attribute */
    static final String ToolGroupId = "MIDDLE_WARE_TOOL.TOOL_GROUP_ID";

    /** Attribute */
    static final String ToolScript = "MIDDLE_WARE_TOOL.TOOL_SCRIPT";

    /** Attribute */
    static final String ToolScriptType = "MIDDLE_WARE_TOOL.TOOL_SCRIPT_TYPE";

    /** Attribute */
    static final String LastEditorId = "MIDDLE_WARE_TOOL.LAST_EDITOR_ID";

    /** Attribute */
    static final String LastEditTime = "MIDDLE_WARE_TOOL.LAST_EDIT_TIME";

    /** Attribute */
    static final String LastEditorName = "employeeA.NAME";

    /** Attribute */
    static final String ToolName = "MIDDLE_WARE_TOOL.TOOL_NAME";

    /** Attribute */
    static final String ProviderId = "MIDDLE_WARE_TOOL.PROVIDER_ID";

    /** Attribute */
    static final String ProviderName = "middleWareProviderA.PROVIDER_NAME";

    /** Attribute */
    static final String MiddleWareName = "middleWareProviderA.MIDDLE_WARE_NAME";

    /** Attribute */
    static final String MiddleWareVersion = "middleWareProviderA.MIDDLE_WARE_VERSION";

    /** Attribute */
    static final String MiddleWareType = "middleWareProviderA.MIDDLE_WARE_TYPE";

    /** Attribute */
    static final String ToolProgram = "MIDDLE_WARE_TOOL.TOOL_PROGRAM";

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
        static final String CompleteKeyWork = "completeKeyWork";

        /** Attribute */
        static final String InputForm = "inputForm";

        /** Attribute */
        static final String OutputFile = "outputFile";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SucceedKeyWork = "succeedKeyWork";

        /** Attribute */
        static final String TimeOut = "timeOut";

        /** Attribute */
        static final String ToolGroupId = "toolGroupId";

        /** Attribute */
        static final String ToolScript = "toolScript";

        /** Attribute */
        static final String ToolScriptType = "toolScriptType";

        /** Attribute */
        static final String LastEditorId = "lastEditorId";

        /** Attribute */
        static final String LastEditTime = "lastEditTime";

        /** Attribute */
        static final String LastEditorName = "lastEditorName";

        /** Attribute */
        static final String ToolName = "toolName";

        /** Attribute */
        static final String ProviderId = "providerId";

        /** Attribute */
        static final String ProviderName = "providerName";

        /** Attribute */
        static final String MiddleWareName = "middleWareName";

        /** Attribute */
        static final String MiddleWareVersion = "middleWareVersion";

        /** Attribute */
        static final String MiddleWareType = "middleWareType";

        /** Attribute */
        static final String ToolProgram = "toolProgram";
    } // end DataProperty

    /**
     * Check Unique MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareTool aMiddleWareTool)
        throws Exception;

    /**
     * insert MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareTool(MiddleWareTool aMiddleWareTool)
        throws Exception;

    /**
     * Batch Insert MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareTool(MiddleWareTool[] aMiddleWareTool)
        throws Exception;

    /**
     * Delete MiddleWareTool
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareTool(final long aId) throws Exception;

    /**
     * Delete MiddleWareTool By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareTool(MiddleWareToolDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareTool(MiddleWareTool aMiddleWareTool)
        throws Exception;

    /**
     * Batch Modify MiddleWareTool
     *
     * @param aMiddleWareTool
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareTool(MiddleWareTool[] aMiddleWareTool)
        throws Exception;

    /**
     * Modify MiddleWareTool  By Query Conditions
     *
     * @param aMiddleWareTool Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareTool(MiddleWareTool aMiddleWareTool,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareTool
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareTool findMiddleWareToolById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareTool
     *
     * @param aQueryBean
     *
     * @return IMiddleWareTool[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareTool" containment="true"
     */
    MiddleWareTool[] queryMiddleWareTool(MiddleWareToolDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWareTool
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareTool[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareTool" containment="true"
     */

    //Map queryMiddleWareToolForMap(MiddleWareToolDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareTool
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolCount(MiddleWareToolDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareTool Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolSelective(
        MiddleWareToolDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareTool
     *
     * @param aMiddleWareTools
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareTool(MiddleWareTool[] aMiddleWareTools,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareTool
     *
     * @param aMiddleWareTools
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareTool(MiddleWareTool[] aMiddleWareTools,
        MiddleWareToolDAOQueryBean aQueryBean,
        MiddleWareToolSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareTool[] willAddMiddleWareToolArray,
            MiddleWareTool[] willUpdateMiddleWareToolArray,
            MiddleWareTool[] willDeleteMiddleWareToolArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareTool[] aMiddleWareTools)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareTool[] aMiddleWareTools)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareTool[] aMiddleWareTools)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareTool[] aMiddleWareTools)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareTool[] aMiddleWareTools)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareTools DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareTool[] aMiddleWareTools)
            throws Exception;
    } // end MiddleWareToolSynchronizeCallback

    /**
     * Query Related IMiddleWareToolInput
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInput" containment="true"
     */
    com.ourteam.middleware.dao.MiddleWareToolInput[] queryMiddleWareToolInputs(
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IMiddleWareToolInput to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInput" containment="true"
     */

    //Map queryMiddleWareToolInputsForMap(MiddleWareToolDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IMiddleWareToolInput Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryMiddleWareToolInputsSelective(
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IMiddleWareToolInput
     *
     * @param aMiddleWareToolInput {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInput(
        com.ourteam.middleware.dao.MiddleWareToolInput aMiddleWareToolInput,
        MiddleWareToolDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IMiddleWareToolInput
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInput(MiddleWareToolDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseMiddleWareToolDAO
