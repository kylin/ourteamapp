/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ITeamMember Data Access Object
*  GenDate 2011-11-02 14:32:43  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseTeamMemberDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "TEAM_MEMBER";

    /** Attribute */
    static final String Id = "TEAM_MEMBER.ID";

    /** Attribute */
    static final String Remarks = "TEAM_MEMBER.REMARKS";

    /** Attribute */
    static final String Status = "TEAM_MEMBER.STATUS";

    /** Attribute */
    static final String EmployeeId = "TEAM_MEMBER.EMPLOYEE_ID";

    /** Attribute */
    static final String TeamId = "TEAM_MEMBER.TEAM_ID";

    /** Attribute */
    static final String TeamRoleId = "TEAM_MEMBER.TEAM_ROLE_ID";

    /** Attribute */
    static final String TeamRoleCode = "teamRoleA.TEAM_ROLE_CODE";

    /** Attribute */
    static final String TeamRoleName = "teamRoleA.TEAM_ROLE_NAME";

    /** Attribute */
    static final String TeamCode = "teamA.TEAM_CODE";

    /** Attribute */
    static final String TeamName = "teamA.TEAM_NAME";

    /** Attribute */
    static final String EmployeeName = "employeeA.NAME";

    /** Attribute */
    static final String EmployeeCode = "employeeA.CODE";

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
        static final String EmployeeId = "employeeId";

        /** Attribute */
        static final String TeamId = "teamId";

        /** Attribute */
        static final String TeamRoleId = "teamRoleId";

        /** Attribute */
        static final String TeamRoleCode = "teamRoleCode";

        /** Attribute */
        static final String TeamRoleName = "teamRoleName";

        /** Attribute */
        static final String TeamCode = "teamCode";

        /** Attribute */
        static final String TeamName = "teamName";

        /** Attribute */
        static final String EmployeeName = "employeeName";

        /** Attribute */
        static final String EmployeeCode = "employeeCode";
    } // end DataProperty

    /**
     * Check Unique TeamMember
     *
     * @param aTeamMember
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(TeamMember aTeamMember) throws Exception;

    /**
     * insert TeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     *
     * @model
     */
    void insertTeamMember(TeamMember aTeamMember) throws Exception;

    /**
     * Batch Insert TeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertTeamMember(TeamMember[] aTeamMember)
        throws Exception;

    /**
     * Delete TeamMember
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamMember(final long aId) throws Exception;

    /**
     * Delete TeamMember By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteTeamMember(TeamMemberDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify TeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamMember(TeamMember aTeamMember) throws Exception;

    /**
     * Batch Modify TeamMember
     *
     * @param aTeamMember
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateTeamMember(TeamMember[] aTeamMember)
        throws Exception;

    /**
     * Modify TeamMember  By Query Conditions
     *
     * @param aTeamMember Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateTeamMember(TeamMember aTeamMember,
        TeamMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query TeamMember
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    TeamMember findTeamMemberById(final long aId) throws Exception;

    /**
     * Query TeamMember
     *
     * @param aQueryBean
     *
     * @return ITeamMember[]
     *
     * @throws Exception
     *
     * @model type="ITeamMember" containment="true"
     */
    TeamMember[] queryTeamMember(TeamMemberDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query TeamMember
     *
     * @param aBaseQueryBean
     *
     * @return ITeamMember[]
     *
     * @throws Exception
     *
     * @model type="ITeamMember" containment="true"
     */

    //Map queryTeamMemberForMap(TeamMemberDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count TeamMember
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryTeamMemberCount(TeamMemberDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query TeamMember Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryTeamMemberSelective(TeamMemberDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize TeamMember
     *
     * @param aTeamMembers
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamMember(TeamMember[] aTeamMembers,
        TeamMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize TeamMember
     *
     * @param aTeamMembers
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeTeamMember(TeamMember[] aTeamMembers,
        TeamMemberDAOQueryBean aQueryBean,
        TeamMemberSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface TeamMemberSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddTeamMemberArray DOCUMENT ME!
         * @param willUpdateTeamMemberArray DOCUMENT ME!
         * @param willDeleteTeamMemberArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(TeamMember[] willAddTeamMemberArray,
            TeamMember[] willUpdateTeamMemberArray,
            TeamMember[] willDeleteTeamMemberArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(TeamMember[] aTeamMembers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(TeamMember[] aTeamMembers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(TeamMember[] aTeamMembers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(TeamMember[] aTeamMembers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(TeamMember[] aTeamMembers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aTeamMembers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(TeamMember[] aTeamMembers) throws Exception;
    } // end TeamMemberSynchronizeCallback

    /**
     * Query Related IEmployee
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */
    com.ourteam.hr.dao.Employee[] queryEmployees(
        TeamMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IEmployee to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IEmployee" containment="true"
     */

    //Map queryEmployeesForMap(TeamMemberDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IEmployee Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryEmployeesSelective(TeamMemberDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IEmployee
     *
     * @param aEmployee {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateEmployee(com.ourteam.hr.dao.Employee aEmployee,
        TeamMemberDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IEmployee
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteEmployee(TeamMemberDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseTeamMemberDAO
