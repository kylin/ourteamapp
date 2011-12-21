/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ITeamBusinessDefine Data Access Object
*  GenDate 2011-09-22 10:17:54  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseTeamBusinessDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "TEAM_BUSINESS_DEFINE";

    /** Attribute */
    static final String Id = "TEAM_BUSINESS_DEFINE.ID";

    /** Attribute */
    static final String ItemIcon = "TEAM_BUSINESS_DEFINE.ITEM_ICON";

    /** Attribute */
    static final String ItemTitle = "TEAM_BUSINESS_DEFINE.ITEM_TITLE";

    /** Attribute */
    static final String ItemType = "TEAM_BUSINESS_DEFINE.ITEM_TYPE";

    /** Attribute */
    static final String LinkPath = "TEAM_BUSINESS_DEFINE.LINK_PATH";

    /** Attribute */
    static final String Remarks = "TEAM_BUSINESS_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "TEAM_BUSINESS_DEFINE.STATUS";

    /** Attribute */
    static final String TeamId = "TEAM_BUSINESS_DEFINE.TEAM_ID";

    /** Attribute */
    static final String ItemCode = "TEAM_BUSINESS_DEFINE.ITEM_CODE";

    /** Attribute */
    static final String TeamName = "teamDefineD.TEAM_NAME";

    /** Attribute */
    static final String ActionGroupId = "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID";

    /** Attribute */
    static final String SubNodeBuilder = "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER";

    /** Attribute */
    static final String SortIndex = "TEAM_BUSINESS_DEFINE.SORT_INDEX";

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
        static final String ItemIcon = "itemIcon";

        /** Attribute */
        static final String ItemTitle = "itemTitle";

        /** Attribute */
        static final String ItemType = "itemType";

        /** Attribute */
        static final String LinkPath = "linkPath";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TeamId = "teamId";

        /** Attribute */
        static final String ItemCode = "itemCode";

        /** Attribute */
        static final String TeamName = "teamName";

        /** Attribute */
        static final String ActionGroupId = "actionGroupId";

        /** Attribute */
        static final String SubNodeBuilder = "subNodeBuilder";

        /** Attribute */
        static final String SortIndex = "sortIndex";
    } // end DataProperty

    /**
     * Check Unique TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception;

    /**
     * insert TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertTeamBusinessDefine(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception;

    /**
     * Batch Insert TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertTeamBusinessDefine(TeamBusinessDefine[] aTeamBusinessDefine)
        throws Exception;

    /**
     * Delete TeamBusinessDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamBusinessDefine(final long aId) throws Exception;

    /**
     * Delete TeamBusinessDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamBusinessDefine(TeamBusinessDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamBusinessDefine(TeamBusinessDefine aTeamBusinessDefine)
        throws Exception;

    /**
     * Batch Modify TeamBusinessDefine
     *
     * @param aTeamBusinessDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateTeamBusinessDefine(TeamBusinessDefine[] aTeamBusinessDefine)
        throws Exception;

    /**
     * Modify TeamBusinessDefine  By Query Conditions
     *
     * @param aTeamBusinessDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamBusinessDefine(TeamBusinessDefine aTeamBusinessDefine,
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamBusinessDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    TeamBusinessDefine findTeamBusinessDefineById(final long aId)
        throws Exception;

    /**
     * Query TeamBusinessDefine
     *
     * @param aQueryBean
     *
     * @return ITeamBusinessDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamBusinessDefine" containment="true"
     */
    TeamBusinessDefine[] queryTeamBusinessDefine(
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamBusinessDefine
     *
     * @param aBaseQueryBean
     *
     * @return ITeamBusinessDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamBusinessDefine" containment="true"
     */

    //Map queryTeamBusinessDefineForMap(TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count TeamBusinessDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryTeamBusinessDefineCount(
        TeamBusinessDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query TeamBusinessDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryTeamBusinessDefineSelective(
        TeamBusinessDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize TeamBusinessDefine
     *
     * @param aTeamBusinessDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefines,
        TeamBusinessDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize TeamBusinessDefine
     *
     * @param aTeamBusinessDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamBusinessDefine(
        TeamBusinessDefine[] aTeamBusinessDefines,
        TeamBusinessDefineDAOQueryBean aQueryBean,
        TeamBusinessDefineSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface TeamBusinessDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddTeamBusinessDefineArray DOCUMENT ME!
         * @param willUpdateTeamBusinessDefineArray DOCUMENT ME!
         * @param willDeleteTeamBusinessDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            TeamBusinessDefine[] willAddTeamBusinessDefineArray,
            TeamBusinessDefine[] willUpdateTeamBusinessDefineArray,
            TeamBusinessDefine[] willDeleteTeamBusinessDefineArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamBusinessDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(TeamBusinessDefine[] aTeamBusinessDefines)
            throws Exception;
    } // end TeamBusinessDefineSynchronizeCallback
} // end IBaseTeamBusinessDefineDAO
