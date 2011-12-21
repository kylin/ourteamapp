/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysUserRoleRelate Data Access Object
*  GenDate 2011-11-07 10:15:09  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysUserRoleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_USER_ROLE_RELATE";

    /** Attribute */
    static final String Id = "SYS_USER_ROLE_RELATE.ID";

    /** Attribute */
    static final String ExpiredDate = "SYS_USER_ROLE_RELATE.EXPIRED_DATE";

    /** Attribute */
    static final String Remarks = "SYS_USER_ROLE_RELATE.REMARKS";

    /** Attribute */
    static final String RoleId = "SYS_USER_ROLE_RELATE.ROLE_ID";

    /** Attribute */
    static final String RoleType = "sysRoleE.ROLE_TYPE";

    /** Attribute */
    static final String Status = "SYS_USER_ROLE_RELATE.STATUS";

    /** Attribute */
    static final String UserId = "SYS_USER_ROLE_RELATE.USER_ID";

    /** Attribute */
    static final String RoleCode = "sysRoleE.ROLE_CODE";

    /** Attribute */
    static final String RoleName = "sysRoleE.ROLE_NAME";

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
        static final String ExpiredDate = "expiredDate";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleId = "roleId";

        /** Attribute */
        static final String RoleType = "roleType";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String UserId = "userId";

        /** Attribute */
        static final String RoleCode = "roleCode";

        /** Attribute */
        static final String RoleName = "roleName";
    } // end DataProperty

    /**
     * Check Unique SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception;

    /**
     * insert SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception;

    /**
     * Batch Insert SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysUserRoleRelate(SysUserRoleRelate[] aSysUserRoleRelate)
        throws Exception;

    /**
     * Delete SysUserRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUserRoleRelate(final long aId) throws Exception;

    /**
     * Delete SysUserRoleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUserRoleRelate(SysUserRoleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception;

    /**
     * Batch Modify SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysUserRoleRelate(SysUserRoleRelate[] aSysUserRoleRelate)
        throws Exception;

    /**
     * Modify SysUserRoleRelate  By Query Conditions
     *
     * @param aSysUserRoleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate,
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysUserRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysUserRoleRelate findSysUserRoleRelateById(final long aId)
        throws Exception;

    /**
     * Query SysUserRoleRelate
     *
     * @param aQueryBean
     *
     * @return ISysUserRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysUserRoleRelate" containment="true"
     */
    SysUserRoleRelate[] querySysUserRoleRelate(
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysUserRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return ISysUserRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysUserRoleRelate" containment="true"
     */

    //Map querySysUserRoleRelateForMap(SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysUserRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysUserRoleRelateCount(
        SysUserRoleRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Query SysUserRoleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysUserRoleRelateSelective(
        SysUserRoleRelateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize SysUserRoleRelate
     *
     * @param aSysUserRoleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUserRoleRelate(SysUserRoleRelate[] aSysUserRoleRelates,
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysUserRoleRelate
     *
     * @param aSysUserRoleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUserRoleRelate(SysUserRoleRelate[] aSysUserRoleRelates,
        SysUserRoleRelateDAOQueryBean aQueryBean,
        SysUserRoleRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysUserRoleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysUserRoleRelateArray DOCUMENT ME!
         * @param willUpdateSysUserRoleRelateArray DOCUMENT ME!
         * @param willDeleteSysUserRoleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysUserRoleRelate[] willAddSysUserRoleRelateArray,
            SysUserRoleRelate[] willUpdateSysUserRoleRelateArray,
            SysUserRoleRelate[] willDeleteSysUserRoleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysUserRoleRelate[] aSysUserRoleRelates)
            throws Exception;
    } // end SysUserRoleRelateSynchronizeCallback
} // end IBaseSysUserRoleRelateDAO
