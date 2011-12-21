/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysUserPassword Data Access Object
*  GenDate 2011-09-22 10:11:25  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysUserPasswordDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "USERS";

    /** Attribute */
    static final String UserName = "USERS.USERNAME";

    /** Attribute */
    static final String Enabled = "USERS.ENABLED";

    /** Attribute */
    static final String Password = "USERS.PASSWORD";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String UserName = "userName";

        /** Attribute */
        static final String Enabled = "enabled";

        /** Attribute */
        static final String Password = "password";
    } // end DataProperty

    /**
     * Check Unique SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysUserPassword aSysUserPassword)
        throws Exception;

    /**
     * insert SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysUserPassword(SysUserPassword aSysUserPassword)
        throws Exception;

    /**
     * Batch Insert SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysUserPassword(SysUserPassword[] aSysUserPassword)
        throws Exception;

    /**
     * Delete SysUserPassword
     *
     * @param aUserName String aUserName
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUserPassword(final String aUserName)
        throws Exception;

    /**
     * Delete SysUserPassword By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysUserPassword(SysUserPasswordDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUserPassword(SysUserPassword aSysUserPassword)
        throws Exception;

    /**
     * Batch Modify SysUserPassword
     *
     * @param aSysUserPassword
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysUserPassword(SysUserPassword[] aSysUserPassword)
        throws Exception;

    /**
     * Modify SysUserPassword  By Query Conditions
     *
     * @param aSysUserPassword Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysUserPassword(SysUserPassword aSysUserPassword,
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysUserPassword
     *
     * @param aUserName String aUserName
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysUserPassword findSysUserPasswordById(final String aUserName)
        throws Exception;

    /**
     * Query SysUserPassword
     *
     * @param aQueryBean
     *
     * @return ISysUserPassword[]
     *
     * @throws Exception
     *
     * @model type="ISysUserPassword" containment="true"
     */
    SysUserPassword[] querySysUserPassword(
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysUserPassword
     *
     * @param aBaseQueryBean
     *
     * @return ISysUserPassword[]
     *
     * @throws Exception
     *
     * @model type="ISysUserPassword" containment="true"
     */

    //Map querySysUserPasswordForMap(SysUserPasswordDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysUserPassword
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysUserPasswordCount(SysUserPasswordDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysUserPassword Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysUserPasswordSelective(
        SysUserPasswordDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize SysUserPassword
     *
     * @param aSysUserPasswords
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUserPassword(SysUserPassword[] aSysUserPasswords,
        SysUserPasswordDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysUserPassword
     *
     * @param aSysUserPasswords
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysUserPassword(SysUserPassword[] aSysUserPasswords,
        SysUserPasswordDAOQueryBean aQueryBean,
        SysUserPasswordSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysUserPasswordSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysUserPasswordArray DOCUMENT ME!
         * @param willUpdateSysUserPasswordArray DOCUMENT ME!
         * @param willDeleteSysUserPasswordArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysUserPassword[] willAddSysUserPasswordArray,
            SysUserPassword[] willUpdateSysUserPasswordArray,
            SysUserPassword[] willDeleteSysUserPasswordArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysUserPassword[] aSysUserPasswords)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysUserPassword[] aSysUserPasswords)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysUserPassword[] aSysUserPasswords)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysUserPassword[] aSysUserPasswords)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysUserPassword[] aSysUserPasswords)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysUserPasswords DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysUserPassword[] aSysUserPasswords)
            throws Exception;
    } // end SysUserPasswordSynchronizeCallback
} // end IBaseSysUserPasswordDAO
