/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ITeamDefine Data Access Object
*  GenDate 2011-09-22 10:17:55  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseTeamDefineDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "TEAM_DEFINE";

    /** Attribute */
    static final String Id = "TEAM_DEFINE.ID";

    /** Attribute */
    static final String Remarks = "TEAM_DEFINE.REMARKS";

    /** Attribute */
    static final String Status = "TEAM_DEFINE.STATUS";

    /** Attribute */
    static final String TeamCode = "TEAM_DEFINE.TEAM_CODE";

    /** Attribute */
    static final String TeamMaill = "TEAM_DEFINE.TEAM_MAIL";

    /** Attribute */
    static final String TeamName = "TEAM_DEFINE.TEAM_NAME";

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
        static final String TeamCode = "teamCode";

        /** Attribute */
        static final String TeamMaill = "teamMaill";

        /** Attribute */
        static final String TeamName = "teamName";
    } // end DataProperty

    /**
     * Check Unique TeamDefine
     *
     * @param aTeamDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(TeamDefine aTeamDefine) throws Exception;

    /**
     * insert TeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void insertTeamDefine(TeamDefine aTeamDefine) throws Exception;

    /**
     * Batch Insert TeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertTeamDefine(TeamDefine[] aTeamDefine)
        throws Exception;

    /**
     * Delete TeamDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefine(final long aId) throws Exception;

    /**
     * Delete TeamDefine By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamDefine(TeamDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify TeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamDefine(TeamDefine aTeamDefine) throws Exception;

    /**
     * Batch Modify TeamDefine
     *
     * @param aTeamDefine
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateTeamDefine(TeamDefine[] aTeamDefine)
        throws Exception;

    /**
     * Modify TeamDefine  By Query Conditions
     *
     * @param aTeamDefine Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamDefine(TeamDefine aTeamDefine,
        TeamDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    TeamDefine findTeamDefineById(final long aId) throws Exception;

    /**
     * Query TeamDefine
     *
     * @param aQueryBean
     *
     * @return ITeamDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamDefine" containment="true"
     */
    TeamDefine[] queryTeamDefine(TeamDefineDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query TeamDefine
     *
     * @param aBaseQueryBean
     *
     * @return ITeamDefine[]
     *
     * @throws Exception
     *
     * @model type="ITeamDefine" containment="true"
     */

    //Map queryTeamDefineForMap(TeamDefineDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count TeamDefine
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryTeamDefineCount(TeamDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query TeamDefine Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryTeamDefineSelective(TeamDefineDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize TeamDefine
     *
     * @param aTeamDefines
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamDefine(TeamDefine[] aTeamDefines,
        TeamDefineDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize TeamDefine
     *
     * @param aTeamDefines
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamDefine(TeamDefine[] aTeamDefines,
        TeamDefineDAOQueryBean aQueryBean,
        TeamDefineSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface TeamDefineSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddTeamDefineArray DOCUMENT ME!
         * @param willUpdateTeamDefineArray DOCUMENT ME!
         * @param willDeleteTeamDefineArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(TeamDefine[] willAddTeamDefineArray,
            TeamDefine[] willUpdateTeamDefineArray,
            TeamDefine[] willDeleteTeamDefineArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(TeamDefine[] aTeamDefines) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(TeamDefine[] aTeamDefines) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(TeamDefine[] aTeamDefines) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(TeamDefine[] aTeamDefines) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(TeamDefine[] aTeamDefines) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamDefines DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(TeamDefine[] aTeamDefines) throws Exception;
    } // end TeamDefineSynchronizeCallback
} // end IBaseTeamDefineDAO
