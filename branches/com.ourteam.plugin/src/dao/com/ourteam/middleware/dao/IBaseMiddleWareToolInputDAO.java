/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareToolInput Data Access Object
*  GenDate 2011-12-08 15:07:38  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolInputDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL_INPUT";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL_INPUT.ID";

    /** Attribute */
    static final String IsRequired = "MIDDLE_WARE_TOOL_INPUT.IS_REQUIRED";

    /** Attribute */
    static final String ParameterCode = "MIDDLE_WARE_TOOL_INPUT.PARAMETER_CODE";

    /** Attribute */
    static final String ParameterName = "MIDDLE_WARE_TOOL_INPUT.PARAMETER_NAME";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL_INPUT.REMARKS";

    /** Attribute */
    static final String SortIndex = "MIDDLE_WARE_TOOL_INPUT.SORT_INDEX";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL_INPUT.STATUS";

    /** Attribute */
    static final String ToolId = "MIDDLE_WARE_TOOL_INPUT.TOOL_ID";

    /** Attribute */
    static final String ParameterType = "MIDDLE_WARE_TOOL_INPUT.PARAMETER_TYPE";

    /** Attribute */
    static final String DefaultValue = "MIDDLE_WARE_TOOL_INPUT.DEFAULT_VALUE";

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
        static final String IsRequired = "isRequired";

        /** Attribute */
        static final String ParameterCode = "parameterCode";

        /** Attribute */
        static final String ParameterName = "parameterName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ToolId = "toolId";

        /** Attribute */
        static final String ParameterType = "parameterType";

        /** Attribute */
        static final String DefaultValue = "defaultValue";
    } // end DataProperty

    /**
     * Check Unique MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareToolInput aMiddleWareToolInput)
        throws Exception;

    /**
     * insert MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareToolInput(MiddleWareToolInput aMiddleWareToolInput)
        throws Exception;

    /**
     * Batch Insert MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInput) throws Exception;

    /**
     * Delete MiddleWareToolInput
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInput(final long aId) throws Exception;

    /**
     * Delete MiddleWareToolInput By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInput(MiddleWareToolInputDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInput(MiddleWareToolInput aMiddleWareToolInput)
        throws Exception;

    /**
     * Batch Modify MiddleWareToolInput
     *
     * @param aMiddleWareToolInput
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInput) throws Exception;

    /**
     * Modify MiddleWareToolInput  By Query Conditions
     *
     * @param aMiddleWareToolInput Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInput(MiddleWareToolInput aMiddleWareToolInput,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolInput
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareToolInput findMiddleWareToolInputById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareToolInput
     *
     * @param aQueryBean
     *
     * @return IMiddleWareToolInput[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInput" containment="true"
     */
    MiddleWareToolInput[] queryMiddleWareToolInput(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolInput
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareToolInput[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInput" containment="true"
     */

    //Map queryMiddleWareToolInputForMap(MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareToolInput
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolInputCount(
        MiddleWareToolInputDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInput Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolInputSelective(
        MiddleWareToolInputDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolInput
     *
     * @param aMiddleWareToolInputs
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInputs,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareToolInput
     *
     * @param aMiddleWareToolInputs
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInput(
        MiddleWareToolInput[] aMiddleWareToolInputs,
        MiddleWareToolInputDAOQueryBean aQueryBean,
        MiddleWareToolInputSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolInputSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolInputArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolInputArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolInputArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareToolInput[] willAddMiddleWareToolInputArray,
            MiddleWareToolInput[] willUpdateMiddleWareToolInputArray,
            MiddleWareToolInput[] willDeleteMiddleWareToolInputArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputs DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareToolInput[] aMiddleWareToolInputs)
            throws Exception;
    } // end MiddleWareToolInputSynchronizeCallback

    /**
     * Query Related IMiddleWareToolInputOption
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputOption" containment="true"
     */
    com.ourteam.middleware.dao.MiddleWareToolInputOption[] queryMiddleWareToolInputOptions(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IMiddleWareToolInputOption to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputOption" containment="true"
     */

    //Map queryMiddleWareToolInputOptionsForMap(MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IMiddleWareToolInputOption Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryMiddleWareToolInputOptionsSelective(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputOption(
        com.ourteam.middleware.dao.MiddleWareToolInputOption aMiddleWareToolInputOption,
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IMiddleWareToolInputOption
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputOption(
        MiddleWareToolInputDAOQueryBean aQueryBean) throws Exception;
} // end IBaseMiddleWareToolInputDAO
