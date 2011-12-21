/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmProcessRolePurview Data Access Object
*  GenDate 2011-11-01 13:19:55  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmProcessRolePurviewDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_PROCESS_ROLE_PURVIEW";

    /** Attribute */
    static final String Id = "BPM_PROCESS_ROLE_PURVIEW.ID";

    /** Attribute */
    static final String CanBreak = "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK";

    /** Attribute */
    static final String CanStart = "BPM_PROCESS_ROLE_PURVIEW.CAN_START";

    /** Attribute */
    static final String ProcessDefineId = "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID";

    /** Attribute */
    static final String Remarks = "BPM_PROCESS_ROLE_PURVIEW.REMARKS";

    /** Attribute */
    static final String RoleId = "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID";

    /** Attribute */
    static final String Status = "BPM_PROCESS_ROLE_PURVIEW.STATUS";

    /** Attribute */
    static final String RoleName = "bpmRoleD.ROLE_NAME";

    /** Attribute */
    static final String RoleCode = "bpmRoleD.ROLE_KEY";

    /** Attribute */
    static final String CanReAssign = "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN";

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
        static final String CanBreak = "canBreak";

        /** Attribute */
        static final String CanStart = "canStart";

        /** Attribute */
        static final String ProcessDefineId = "processDefineId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleId = "roleId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String RoleName = "roleName";

        /** Attribute */
        static final String RoleCode = "roleCode";

        /** Attribute */
        static final String CanReAssign = "canReAssign";
    } // end DataProperty

    /**
     * Check Unique BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmProcessRolePurview aBpmProcessRolePurview)
        throws Exception;

    /**
     * insert BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview) throws Exception;

    /**
     * Batch Insert BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurview)
        throws Exception;

    /**
     * Delete BpmProcessRolePurview
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessRolePurview(final long aId) throws Exception;

    /**
     * Delete BpmProcessRolePurview By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmProcessRolePurview(
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception;

    /**
     * Modify BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview) throws Exception;

    /**
     * Batch Modify BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurview
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurview)
        throws Exception;

    /**
     * Modify BpmProcessRolePurview  By Query Conditions
     *
     * @param aBpmProcessRolePurview Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmProcessRolePurview(
        BpmProcessRolePurview aBpmProcessRolePurview,
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessRolePurview
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmProcessRolePurview findBpmProcessRolePurviewById(final long aId)
        throws Exception;

    /**
     * Query BpmProcessRolePurview
     *
     * @param aQueryBean
     *
     * @return IBpmProcessRolePurview[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessRolePurview" containment="true"
     */
    BpmProcessRolePurview[] queryBpmProcessRolePurview(
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BpmProcessRolePurview
     *
     * @param aBaseQueryBean
     *
     * @return IBpmProcessRolePurview[]
     *
     * @throws Exception
     *
     * @model type="IBpmProcessRolePurview" containment="true"
     */

    //Map queryBpmProcessRolePurviewForMap(BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmProcessRolePurview
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmProcessRolePurviewCount(
        BpmProcessRolePurviewDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmProcessRolePurview Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmProcessRolePurviewSelective(
        BpmProcessRolePurviewDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurviews
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurviews,
        BpmProcessRolePurviewDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BpmProcessRolePurview
     *
     * @param aBpmProcessRolePurviews
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmProcessRolePurview(
        BpmProcessRolePurview[] aBpmProcessRolePurviews,
        BpmProcessRolePurviewDAOQueryBean aQueryBean,
        BpmProcessRolePurviewSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmProcessRolePurviewSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmProcessRolePurviewArray DOCUMENT ME!
         * @param willUpdateBpmProcessRolePurviewArray DOCUMENT ME!
         * @param willDeleteBpmProcessRolePurviewArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BpmProcessRolePurview[] willAddBpmProcessRolePurviewArray,
            BpmProcessRolePurview[] willUpdateBpmProcessRolePurviewArray,
            BpmProcessRolePurview[] willDeleteBpmProcessRolePurviewArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmProcessRolePurviews DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmProcessRolePurview[] aBpmProcessRolePurviews)
            throws Exception;
    } // end BpmProcessRolePurviewSynchronizeCallback
} // end IBaseBpmProcessRolePurviewDAO
