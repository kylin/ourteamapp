/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareToolInputOption Data Access Object
*  GenDate 2011-12-08 15:06:50  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolInputOptionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL_INPUT_OPTION";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL_INPUT_OPTION.ID";

    /** Attribute */
    static final String DisplayLabel = "MIDDLE_WARE_TOOL_INPUT_OPTION.DISPLAY_LABEL";

    /** Attribute */
    static final String RealValue = "MIDDLE_WARE_TOOL_INPUT_OPTION.REAL_VALUE";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL_INPUT_OPTION.REMARKS";

    /** Attribute */
    static final String SortIndex = "MIDDLE_WARE_TOOL_INPUT_OPTION.SORT_INDEX";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL_INPUT_OPTION.STATUS";

    /** Attribute */
    static final String ToolInputId = "MIDDLE_WARE_TOOL_INPUT_OPTION.TOOL_INPUT_ID";

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
        static final String DisplayLabel = "displayLabel";

        /** Attribute */
        static final String RealValue = "realValue";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ToolInputId = "toolInputId";
    } // end DataProperty

    /**
     * Check Unique MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception;

    /**
     * insert MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception;

    /**
     * Batch Insert MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOption)
        throws Exception;

    /**
     * Delete MiddleWareToolInputOption
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputOption(final long aId)
        throws Exception;

    /**
     * Delete MiddleWareToolInputOption By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolInputOption(
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception;

    /**
     * Batch Modify MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOption)
        throws Exception;

    /**
     * Modify MiddleWareToolInputOption  By Query Conditions
     *
     * @param aMiddleWareToolInputOption Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputOption
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareToolInputOption findMiddleWareToolInputOptionById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareToolInputOption
     *
     * @param aQueryBean
     *
     * @return IMiddleWareToolInputOption[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputOption" containment="true"
     */
    MiddleWareToolInputOption[] queryMiddleWareToolInputOption(
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputOption
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareToolInputOption[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputOption" containment="true"
     */

    //Map queryMiddleWareToolInputOptionForMap(MiddleWareToolInputOptionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareToolInputOption
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolInputOptionCount(
        MiddleWareToolInputOptionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolInputOption Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolInputOptionSelective(
        MiddleWareToolInputOptionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOptions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOptions,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOptions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOptions,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean,
        MiddleWareToolInputOptionSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolInputOptionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolInputOptionArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolInputOptionArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolInputOptionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareToolInputOption[] willAddMiddleWareToolInputOptionArray,
            MiddleWareToolInputOption[] willUpdateMiddleWareToolInputOptionArray,
            MiddleWareToolInputOption[] willDeleteMiddleWareToolInputOptionArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolInputOptions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            MiddleWareToolInputOption[] aMiddleWareToolInputOptions)
            throws Exception;
    } // end MiddleWareToolInputOptionSynchronizeCallback
} // end IBaseMiddleWareToolInputOptionDAO
