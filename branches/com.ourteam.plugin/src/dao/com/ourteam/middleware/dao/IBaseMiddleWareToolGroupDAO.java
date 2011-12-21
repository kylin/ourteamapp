/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IMiddleWareToolGroup Data Access Object
*  GenDate 2011-12-07 08:45:29  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseMiddleWareToolGroupDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "MIDDLE_WARE_TOOL_GROUP";

    /** Attribute */
    static final String Id = "MIDDLE_WARE_TOOL_GROUP.ID";

    /** Attribute */
    static final String GroupName = "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME";

    /** Attribute */
    static final String Remarks = "MIDDLE_WARE_TOOL_GROUP.REMARKS";

    /** Attribute */
    static final String SortIndex = "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX";

    /** Attribute */
    static final String Status = "MIDDLE_WARE_TOOL_GROUP.STATUS";

    /** Attribute */
    static final String ParentGroupId = "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID";

    /** Attribute */
    static final String ProviderId = "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID";

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
        static final String GroupName = "groupName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String SortIndex = "sortIndex";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ParentGroupId = "parentGroupId";

        /** Attribute */
        static final String ProviderId = "providerId";
    } // end DataProperty

    /**
     * Check Unique MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(MiddleWareToolGroup aMiddleWareToolGroup)
        throws Exception;

    /**
     * insert MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void insertMiddleWareToolGroup(MiddleWareToolGroup aMiddleWareToolGroup)
        throws Exception;

    /**
     * Batch Insert MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroup) throws Exception;

    /**
     * Delete MiddleWareToolGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolGroup(final long aId) throws Exception;

    /**
     * Delete MiddleWareToolGroup By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMiddleWareToolGroup(MiddleWareToolGroupDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolGroup(MiddleWareToolGroup aMiddleWareToolGroup)
        throws Exception;

    /**
     * Batch Modify MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroup) throws Exception;

    /**
     * Modify MiddleWareToolGroup  By Query Conditions
     *
     * @param aMiddleWareToolGroup Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateMiddleWareToolGroup(MiddleWareToolGroup aMiddleWareToolGroup,
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    MiddleWareToolGroup findMiddleWareToolGroupById(final long aId)
        throws Exception;

    /**
     * Query MiddleWareToolGroup
     *
     * @param aQueryBean
     *
     * @return IMiddleWareToolGroup[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolGroup" containment="true"
     */
    MiddleWareToolGroup[] queryMiddleWareToolGroup(
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query MiddleWareToolGroup
     *
     * @param aBaseQueryBean
     *
     * @return IMiddleWareToolGroup[]
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolGroup" containment="true"
     */

    //Map queryMiddleWareToolGroupForMap(MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count MiddleWareToolGroup
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryMiddleWareToolGroupCount(
        MiddleWareToolGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query MiddleWareToolGroup Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryMiddleWareToolGroupSelective(
        MiddleWareToolGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroups
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroups,
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroups
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroups,
        MiddleWareToolGroupDAOQueryBean aQueryBean,
        MiddleWareToolGroupSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface MiddleWareToolGroupSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddMiddleWareToolGroupArray DOCUMENT ME!
         * @param willUpdateMiddleWareToolGroupArray DOCUMENT ME!
         * @param willDeleteMiddleWareToolGroupArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            MiddleWareToolGroup[] willAddMiddleWareToolGroupArray,
            MiddleWareToolGroup[] willUpdateMiddleWareToolGroupArray,
            MiddleWareToolGroup[] willDeleteMiddleWareToolGroupArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aMiddleWareToolGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(MiddleWareToolGroup[] aMiddleWareToolGroups)
            throws Exception;
    } // end MiddleWareToolGroupSynchronizeCallback
} // end IBaseMiddleWareToolGroupDAO
