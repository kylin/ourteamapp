/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ITeamRole Data Access Object
*  GenDate 2011-09-22 10:17:57  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseTeamRoleDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "TEAM_ROLE";

    /** Attribute */
    static final String Id = "TEAM_ROLE.ID";

    /** Attribute */
    static final String Remarks = "TEAM_ROLE.REMARKS";

    /** Attribute */
    static final String Status = "TEAM_ROLE.STATUS";

    /** Attribute */
    static final String TeamRoleCode = "TEAM_ROLE.TEAM_ROLE_CODE";

    /** Attribute */
    static final String TeamRoleName = "TEAM_ROLE.TEAM_ROLE_NAME";

    /** Attribute */
    static final String TeamId = "TEAM_ROLE.TEAM_ID";

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
        static final String TeamRoleCode = "teamRoleCode";

        /** Attribute */
        static final String TeamRoleName = "teamRoleName";

        /** Attribute */
        static final String TeamId = "teamId";
    } // end DataProperty

    /**
     * Check Unique TeamRole
     *
     * @param aTeamRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(TeamRole aTeamRole) throws Exception;

    /**
     * insert TeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     *
     * @model
     */
    void insertTeamRole(TeamRole aTeamRole) throws Exception;

    /**
     * Batch Insert TeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertTeamRole(TeamRole[] aTeamRole) throws Exception;

    /**
     * Delete TeamRole
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamRole(final long aId) throws Exception;

    /**
     * Delete TeamRole By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamRole(TeamRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify TeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamRole(TeamRole aTeamRole) throws Exception;

    /**
     * Batch Modify TeamRole
     *
     * @param aTeamRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateTeamRole(TeamRole[] aTeamRole) throws Exception;

    /**
     * Modify TeamRole  By Query Conditions
     *
     * @param aTeamRole Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamRole(TeamRole aTeamRole, TeamRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query TeamRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    TeamRole findTeamRoleById(final long aId) throws Exception;

    /**
     * Query TeamRole
     *
     * @param aQueryBean
     *
     * @return ITeamRole[]
     *
     * @throws Exception
     *
     * @model type="ITeamRole" containment="true"
     */
    TeamRole[] queryTeamRole(TeamRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query TeamRole
     *
     * @param aBaseQueryBean
     *
     * @return ITeamRole[]
     *
     * @throws Exception
     *
     * @model type="ITeamRole" containment="true"
     */

    //Map queryTeamRoleForMap(TeamRoleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count TeamRole
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryTeamRoleCount(TeamRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query TeamRole Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryTeamRoleSelective(TeamRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize TeamRole
     *
     * @param aTeamRoles
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamRole(TeamRole[] aTeamRoles,
        TeamRoleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize TeamRole
     *
     * @param aTeamRoles
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamRole(TeamRole[] aTeamRoles,
        TeamRoleDAOQueryBean aQueryBean, TeamRoleSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface TeamRoleSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddTeamRoleArray DOCUMENT ME!
         * @param willUpdateTeamRoleArray DOCUMENT ME!
         * @param willDeleteTeamRoleArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(TeamRole[] willAddTeamRoleArray,
            TeamRole[] willUpdateTeamRoleArray,
            TeamRole[] willDeleteTeamRoleArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(TeamRole[] aTeamRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(TeamRole[] aTeamRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(TeamRole[] aTeamRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(TeamRole[] aTeamRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(TeamRole[] aTeamRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(TeamRole[] aTeamRoles) throws Exception;
    } // end TeamRoleSynchronizeCallback
} // end IBaseTeamRoleDAO
