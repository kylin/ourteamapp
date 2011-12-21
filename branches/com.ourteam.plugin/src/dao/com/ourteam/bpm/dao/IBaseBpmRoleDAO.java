/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBpmRole Data Access Object
*  GenDate 2011-11-04 13:12:55  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBpmRoleDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BPM_ROLE";

    /** Attribute */
    static final String Id = "BPM_ROLE.ID";

    /** Attribute */
    static final String Remarks = "BPM_ROLE.REMARKS";

    /** Attribute */
    static final String RoleKey = "BPM_ROLE.ROLE_KEY";

    /** Attribute */
    static final String RoleName = "BPM_ROLE.ROLE_NAME";

    /** Attribute */
    static final String Status = "BPM_ROLE.STATUS";

    /** Attribute */
    static final String SysModuleId = "BPM_ROLE.SYS_MODULE_ID";

    /** Attribute */
    static final String SysModuleName = "sysModuleB.MODULE_NAME";

    /** Attribute */
    static final String SysModuleCode = "sysModuleB.MODULE_CODE";

    /** Attribute */
    static final String BpmDomainId = "BPM_ROLE.BPM_DOMAIN_ID";

    /** Attribute */
    static final String BpmDomainCode = "bpmDomainB.CODE";

    /** Attribute */
    static final String BpmDomainName = "bpmDomainB.NAME";

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
        static final String RoleKey = "roleKey";

        /** Attribute */
        static final String RoleName = "roleName";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysModuleId = "sysModuleId";

        /** Attribute */
        static final String SysModuleName = "sysModuleName";

        /** Attribute */
        static final String SysModuleCode = "sysModuleCode";

        /** Attribute */
        static final String BpmDomainId = "bpmDomainId";

        /** Attribute */
        static final String BpmDomainCode = "bpmDomainCode";

        /** Attribute */
        static final String BpmDomainName = "bpmDomainName";
    } // end DataProperty

    /**
     * Check Unique BpmRole
     *
     * @param aBpmRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BpmRole aBpmRole) throws Exception;

    /**
     * insert BpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void insertBpmRole(BpmRole aBpmRole) throws Exception;

    /**
     * Batch Insert BpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBpmRole(BpmRole[] aBpmRole) throws Exception;

    /**
     * Delete BpmRole
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmRole(final long aId) throws Exception;

    /**
     * Delete BpmRole By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBpmRole(BpmRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmRole(BpmRole aBpmRole) throws Exception;

    /**
     * Batch Modify BpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBpmRole(BpmRole[] aBpmRole) throws Exception;

    /**
     * Modify BpmRole  By Query Conditions
     *
     * @param aBpmRole Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBpmRole(BpmRole aBpmRole, BpmRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BpmRole findBpmRoleById(final long aId) throws Exception;

    /**
     * Query BpmRole
     *
     * @param aQueryBean
     *
     * @return IBpmRole[]
     *
     * @throws Exception
     *
     * @model type="IBpmRole" containment="true"
     */
    BpmRole[] queryBpmRole(BpmRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BpmRole
     *
     * @param aBaseQueryBean
     *
     * @return IBpmRole[]
     *
     * @throws Exception
     *
     * @model type="IBpmRole" containment="true"
     */

    //Map queryBpmRoleForMap(BpmRoleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BpmRole
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBpmRoleCount(BpmRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BpmRole Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBpmRoleSelective(BpmRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BpmRole
     *
     * @param aBpmRoles
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmRole(BpmRole[] aBpmRoles, BpmRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BpmRole
     *
     * @param aBpmRoles
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBpmRole(BpmRole[] aBpmRoles,
        BpmRoleDAOQueryBean aQueryBean, BpmRoleSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BpmRoleSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBpmRoleArray DOCUMENT ME!
         * @param willUpdateBpmRoleArray DOCUMENT ME!
         * @param willDeleteBpmRoleArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(BpmRole[] willAddBpmRoleArray,
            BpmRole[] willUpdateBpmRoleArray, BpmRole[] willDeleteBpmRoleArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BpmRole[] aBpmRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BpmRole[] aBpmRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BpmRole[] aBpmRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BpmRole[] aBpmRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BpmRole[] aBpmRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBpmRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BpmRole[] aBpmRoles) throws Exception;
    } // end BpmRoleSynchronizeCallback
} // end IBaseBpmRoleDAO
