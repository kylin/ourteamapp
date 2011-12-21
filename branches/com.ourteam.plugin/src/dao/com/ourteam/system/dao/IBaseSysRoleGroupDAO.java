/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRoleGroup Data Access Object
*  GenDate 2011-09-22 10:11:21  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleGroupDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE";

    /** Attribute */
    static final String Id = "SYS_ROLE.ID";

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
        static final String RoleCode = "roleCode";

        /** Attribute */
        static final String RoleName = "roleName";

        /** Attribute com.ourteam.system.dao.SysRoleTypeEnum */
        static final String RoleType = "roleType";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRoleGroup aSysRoleGroup) throws Exception;

    /**
     * insert SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRoleGroup(SysRoleGroup aSysRoleGroup)
        throws Exception;

    /**
     * Batch Insert SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRoleGroup(SysRoleGroup[] aSysRoleGroup)
        throws Exception;

    /**
     * Delete SysRoleGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleGroup(final long aId) throws Exception;

    /**
     * Delete SysRoleGroup By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleGroup(SysRoleGroupDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleGroup(SysRoleGroup aSysRoleGroup)
        throws Exception;

    /**
     * Batch Modify SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRoleGroup(SysRoleGroup[] aSysRoleGroup)
        throws Exception;

    /**
     * Modify SysRoleGroup  By Query Conditions
     *
     * @param aSysRoleGroup Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleGroup(SysRoleGroup aSysRoleGroup,
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRoleGroup findSysRoleGroupById(final long aId) throws Exception;

    /**
     * Query SysRoleGroup
     *
     * @param aQueryBean
     *
     * @return ISysRoleGroup[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleGroup" containment="true"
     */
    SysRoleGroup[] querySysRoleGroup(SysRoleGroupDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysRoleGroup
     *
     * @param aBaseQueryBean
     *
     * @return ISysRoleGroup[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleGroup" containment="true"
     */

    //Map querySysRoleGroupForMap(SysRoleGroupDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRoleGroup
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleGroupCount(SysRoleGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRoleGroup Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleGroupSelective(SysRoleGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRoleGroup
     *
     * @param aSysRoleGroups
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleGroup(SysRoleGroup[] aSysRoleGroups,
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysRoleGroup
     *
     * @param aSysRoleGroups
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleGroup(SysRoleGroup[] aSysRoleGroups,
        SysRoleGroupDAOQueryBean aQueryBean,
        SysRoleGroupSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleGroupSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleGroupArray DOCUMENT ME!
         * @param willUpdateSysRoleGroupArray DOCUMENT ME!
         * @param willDeleteSysRoleGroupArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysRoleGroup[] willAddSysRoleGroupArray,
            SysRoleGroup[] willUpdateSysRoleGroupArray,
            SysRoleGroup[] willDeleteSysRoleGroupArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRoleGroup[] aSysRoleGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRoleGroup[] aSysRoleGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRoleGroup[] aSysRoleGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRoleGroup[] aSysRoleGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRoleGroup[] aSysRoleGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRoleGroup[] aSysRoleGroups)
            throws Exception;
    } // end SysRoleGroupSynchronizeCallback

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
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception;

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

    //Map querySysRoleRelatesForMap(SysRoleGroupDAOQueryBean aQueryBean) throws Exception;
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
    Map[] querySysRoleRelatesSelective(SysRoleGroupDAOQueryBean aQueryBean)
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
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysRoleRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleRelate(SysRoleGroupDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysRoleGroupDAO
