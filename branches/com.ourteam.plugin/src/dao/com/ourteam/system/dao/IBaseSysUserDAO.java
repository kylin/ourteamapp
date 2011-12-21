/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysUser Data Access Object
*  GenDate 2011-11-07 09:51:14  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysUserDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_USER";

    /** Attribute */
    static final String Id = "SYS_USER.ID";

    /** Attribute */
    static final String Remarks = "SYS_USER.REMARKS";

    /** Attribute */
    static final String Status = "SYS_USER.STATUS";

    /** Attribute */
    static final String UserAccount = "SYS_USER.USER_ACCOUNT";

    /** Attribute */
    static final String UserName = "SYS_USER.USER_NAME";

    /** Attribute */
    static final String UserType = "SYS_USER.USER_TYPE";

    /** Attribute */
    static final String Password = "SYS_USER.PASSWORD";

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
        static final String UserAccount = "userAccount";

        /** Attribute */
        static final String UserName = "userName";

        /** Attribute */
        static final String UserType = "userType";

        /** Attribute */
        static final String Password = "password";
    } // end DataProperty

    /**
     * Check Unique SysUser
     *
     * @param aSysUser
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysUser aSysUser) throws Exception;

    /**
     * insert SysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysUser(SysUser aSysUser) throws Exception;

    /**
     * Batch Insert SysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysUser(SysUser[] aSysUser) throws Exception;

    /**
     * Delete SysUser
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUser(final long aId) throws Exception;

    /**
     * Delete SysUser By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUser(SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUser(SysUser aSysUser) throws Exception;

    /**
     * Batch Modify SysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysUser(SysUser[] aSysUser) throws Exception;

    /**
     * Modify SysUser  By Query Conditions
     *
     * @param aSysUser Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUser(SysUser aSysUser, SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysUser
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysUser findSysUserById(final long aId) throws Exception;

    /**
     * Query SysUser
     *
     * @param aQueryBean
     *
     * @return ISysUser[]
     *
     * @throws Exception
     *
     * @model type="ISysUser" containment="true"
     */
    SysUser[] querySysUser(SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysUser
     *
     * @param aBaseQueryBean
     *
     * @return ISysUser[]
     *
     * @throws Exception
     *
     * @model type="ISysUser" containment="true"
     */

    //Map querySysUserForMap(SysUserDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysUser
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysUserCount(SysUserDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysUser Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysUserSelective(SysUserDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysUser
     *
     * @param aSysUsers
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUser(SysUser[] aSysUsers, SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize SysUser
     *
     * @param aSysUsers
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUser(SysUser[] aSysUsers,
        SysUserDAOQueryBean aQueryBean, SysUserSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysUserSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysUserArray DOCUMENT ME!
         * @param willUpdateSysUserArray DOCUMENT ME!
         * @param willDeleteSysUserArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysUser[] willAddSysUserArray,
            SysUser[] willUpdateSysUserArray, SysUser[] willDeleteSysUserArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysUser[] aSysUsers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysUser[] aSysUsers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysUser[] aSysUsers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysUser[] aSysUsers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysUser[] aSysUsers) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUsers DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysUser[] aSysUsers) throws Exception;
    } // end SysUserSynchronizeCallback

    /**
     * Query Related ISysUserRoleRelate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysUserRoleRelate" containment="true"
     */
    com.ourteam.system.dao.SysUserRoleRelate[] querySysUserRoleRelates(
        SysUserDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysUserRoleRelate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysUserRoleRelate" containment="true"
     */

    //Map querySysUserRoleRelatesForMap(SysUserDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysUserRoleRelate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysUserRoleRelatesSelective(SysUserDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUserRoleRelate(
        com.ourteam.system.dao.SysUserRoleRelate aSysUserRoleRelate,
        SysUserDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysUserRoleRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUserRoleRelate(SysUserDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysUserDAO
