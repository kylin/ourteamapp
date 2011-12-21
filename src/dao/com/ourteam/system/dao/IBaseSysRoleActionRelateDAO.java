/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRoleActionRelate Data Access Object
*  GenDate 2011-12-12 21:19:58  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleActionRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE_ACTION_RELATE";

    /** Attribute */
    static final String Id = "SYS_ROLE_ACTION_RELATE.ID";

    /** Attribute */
    static final String ActionId = "SYS_ROLE_ACTION_RELATE.ACTION_ID";

    /** Attribute */
    static final String Remarks = "SYS_ROLE_ACTION_RELATE.REMARKS";

    /** Attribute */
    static final String RoleId = "SYS_ROLE_ACTION_RELATE.ROLE_ID";

    /** Attribute */
    static final String Status = "SYS_ROLE_ACTION_RELATE.STATUS";

    /** Attribute */
    static final String ActionCode = "sysActionAA.ACTION_CODE";

    /** Attribute */
    static final String ActionName = "sysActionAA.ACTION_NAME";

    /** Attribute */
    static final String DomainId = "sysActionAA.DOMAIN_ID";

    /** Attribute */
    static final String DomainName = "sysDomainAA.DOMAIN_NAME";

    /** Attribute */
    static final String DomainCode = "sysDomainAA.DOMAIN_CODE";

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
        static final String ActionId = "actionId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String RoleId = "roleId";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String ActionCode = "actionCode";

        /** Attribute */
        static final String ActionName = "actionName";

        /** Attribute */
        static final String DomainId = "domainId";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String DomainCode = "domainCode";
    } // end DataProperty

    /**
     * Check Unique SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRoleActionRelate aSysRoleActionRelate)
        throws Exception;

    /**
     * insert SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRoleActionRelate(SysRoleActionRelate aSysRoleActionRelate)
        throws Exception;

    /**
     * Batch Insert SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelate) throws Exception;

    /**
     * Delete SysRoleActionRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleActionRelate(final long aId) throws Exception;

    /**
     * Delete SysRoleActionRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleActionRelate(SysRoleActionRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleActionRelate(SysRoleActionRelate aSysRoleActionRelate)
        throws Exception;

    /**
     * Batch Modify SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelate) throws Exception;

    /**
     * Modify SysRoleActionRelate  By Query Conditions
     *
     * @param aSysRoleActionRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleActionRelate(SysRoleActionRelate aSysRoleActionRelate,
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleActionRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRoleActionRelate findSysRoleActionRelateById(final long aId)
        throws Exception;

    /**
     * Query SysRoleActionRelate
     *
     * @param aQueryBean
     *
     * @return ISysRoleActionRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleActionRelate" containment="true"
     */
    SysRoleActionRelate[] querySysRoleActionRelate(
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleActionRelate
     *
     * @param aBaseQueryBean
     *
     * @return ISysRoleActionRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleActionRelate" containment="true"
     */

    //Map querySysRoleActionRelateForMap(SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRoleActionRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleActionRelateCount(
        SysRoleActionRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRoleActionRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleActionRelateSelective(
        SysRoleActionRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRoleActionRelate
     *
     * @param aSysRoleActionRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelates,
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysRoleActionRelate
     *
     * @param aSysRoleActionRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelates,
        SysRoleActionRelateDAOQueryBean aQueryBean,
        SysRoleActionRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleActionRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleActionRelateArray DOCUMENT ME!
         * @param willUpdateSysRoleActionRelateArray DOCUMENT ME!
         * @param willDeleteSysRoleActionRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysRoleActionRelate[] willAddSysRoleActionRelateArray,
            SysRoleActionRelate[] willUpdateSysRoleActionRelateArray,
            SysRoleActionRelate[] willDeleteSysRoleActionRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleActionRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRoleActionRelate[] aSysRoleActionRelates)
            throws Exception;
    } // end SysRoleActionRelateSynchronizeCallback
} // end IBaseSysRoleActionRelateDAO
