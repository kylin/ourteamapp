/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRole Data Access Object
*  GenDate 2011-09-22 10:11:19  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE";

    /** Attribute */
    static final String Id = "SYS_ROLE.ID";

    /** Attribute */
    static final String DomainId = "SYS_ROLE.DOMAIN_ID";

    /** Attribute */
    static final String Remarks = "SYS_ROLE.REMARKS";

    /** Attribute */
    static final String RoleCode = "SYS_ROLE.ROLE_CODE";

    /** Attribute */
    static final String RoleName = "SYS_ROLE.ROLE_NAME";

    /** Attribute com.ourteam.system.dao.SysRoleTypeEnum */
    static final String RoleType = "SYS_ROLE.ROLE_TYPE";

    /** Attribute */
    static final String Status = "SYS_ROLE.STATUS";

    /** Attribute */
    static final String DomainTitleKey = "domain.DOMAIN_TITEL_KEY";

    /** Attribute */
    static final String DomainName = "domain.DOMAIN_NAME";

    /** Attribute */
    static final String DomainCode = "domain.DOMAIN_CODE";

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
        static final String DomainId = "domainId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleCode = "roleCode";

        /** Attribute */
        static final String RoleName = "roleName";

        /** Attribute com.ourteam.system.dao.SysRoleTypeEnum */
        static final String RoleType = "roleType";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DomainTitleKey = "domainTitleKey";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String DomainCode = "domainCode";
    } // end DataProperty

    /**
     * Check Unique SysRole
     *
     * @param aSysRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRole aSysRole) throws Exception;

    /**
     * insert SysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRole(SysRole aSysRole) throws Exception;

    /**
     * Batch Insert SysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRole(SysRole[] aSysRole) throws Exception;

    /**
     * Delete SysRole
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRole(final long aId) throws Exception;

    /**
     * Delete SysRole By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRole(SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRole(SysRole aSysRole) throws Exception;

    /**
     * Batch Modify SysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRole(SysRole[] aSysRole) throws Exception;

    /**
     * Modify SysRole  By Query Conditions
     *
     * @param aSysRole Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRole(SysRole aSysRole, SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRole findSysRoleById(final long aId) throws Exception;

    /**
     * Query SysRole
     *
     * @param aQueryBean
     *
     * @return ISysRole[]
     *
     * @throws Exception
     *
     * @model type="ISysRole" containment="true"
     */
    SysRole[] querySysRole(SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysRole
     *
     * @param aBaseQueryBean
     *
     * @return ISysRole[]
     *
     * @throws Exception
     *
     * @model type="ISysRole" containment="true"
     */

    //Map querySysRoleForMap(SysRoleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRole
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleCount(SysRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRole Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleSelective(SysRoleDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRole
     *
     * @param aSysRoles
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRole(SysRole[] aSysRoles, SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize SysRole
     *
     * @param aSysRoles
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRole(SysRole[] aSysRoles,
        SysRoleDAOQueryBean aQueryBean, SysRoleSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleArray DOCUMENT ME!
         * @param willUpdateSysRoleArray DOCUMENT ME!
         * @param willDeleteSysRoleArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysRole[] willAddSysRoleArray,
            SysRole[] willUpdateSysRoleArray, SysRole[] willDeleteSysRoleArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRole[] aSysRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRole[] aSysRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRole[] aSysRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRole[] aSysRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRole[] aSysRoles) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoles DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRole[] aSysRoles) throws Exception;
    } // end SysRoleSynchronizeCallback

    /**
     * Query Related ISysRoleRelate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleRelate" containment="true"
     */
    com.ourteam.system.dao.SysRoleRelate[] querySysRoleRelates(
        SysRoleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysRoleRelate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleRelate" containment="true"
     */

    //Map querySysRoleRelatesForMap(SysRoleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysRoleRelate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysRoleRelatesSelective(SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysRoleRelate
     *
     * @param aSysRoleRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleRelate(
        com.ourteam.system.dao.SysRoleRelate aSysRoleRelate,
        SysRoleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysRoleRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleRelate(SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Related ISysRoleResourceRelate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleResourceRelate" containment="true"
     */
    com.ourteam.system.dao.SysRoleResourceRelate[] querySysRoleResourceRelates(
        SysRoleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysRoleResourceRelate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleResourceRelate" containment="true"
     */

    //Map querySysRoleResourceRelatesForMap(SysRoleDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysRoleResourceRelate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysRoleResourceRelatesSelective(SysRoleDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleResourceRelate(
        com.ourteam.system.dao.SysRoleResourceRelate aSysRoleResourceRelate,
        SysRoleDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysRoleResourceRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleResourceRelate(SysRoleDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysRoleDAO
