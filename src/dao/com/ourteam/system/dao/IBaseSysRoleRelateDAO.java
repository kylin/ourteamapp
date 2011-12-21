/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysRoleRelate Data Access Object
*  GenDate 2011-09-22 10:11:21  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysRoleRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ROLE_RELATE";

    /** Attribute */
    static final String Id = "SYS_ROLE_RELATE.ID";

    /** Attribute */
    static final String RelatedSysRoleId = "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID";

    /** Attribute */
    static final String Remarks = "SYS_ROLE_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "SYS_ROLE_RELATE.STATUS";

    /** Attribute */
    static final String SysRoleGroupId = "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID";

    /** Attribute */
    static final String RelatedSysRoleCode = "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE";

    /** Attribute */
    static final String SysRoleName = "sysRoleA.ROLE_NAME";

    /** Attribute */
    static final String SysRoleCode = "sysRoleA.ROLE_CODE";

    /** Attribute */
    static final String SysRoleType = "sysRoleA.ROLE_TYPE";

    /** Attribute */
    static final String SysRoleDomainId = "sysRoleA.DOMAIN_ID";

    /** Attribute */
    static final String SysDomainName = "sysDomianA.DOMAIN_NAME";

    /** Attribute */
    static final String SysDomainCode = "sysDomianA.DOMAIN_CODE";

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
        static final String RelatedSysRoleId = "relatedSysRoleId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysRoleGroupId = "sysRoleGroupId";

        /** Attribute */
        static final String RelatedSysRoleCode = "relatedSysRoleCode";

        /** Attribute */
        static final String SysRoleName = "sysRoleName";

        /** Attribute */
        static final String SysRoleCode = "sysRoleCode";

        /** Attribute */
        static final String SysRoleType = "sysRoleType";

        /** Attribute */
        static final String SysRoleDomainId = "sysRoleDomainId";

        /** Attribute */
        static final String SysDomainName = "sysDomainName";

        /** Attribute */
        static final String SysDomainCode = "sysDomainCode";
    } // end DataProperty

    /**
     * Check Unique SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysRoleRelate aSysRoleRelate)
        throws Exception;

    /**
     * insert SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysRoleRelate(SysRoleRelate aSysRoleRelate)
        throws Exception;

    /**
     * Batch Insert SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysRoleRelate(SysRoleRelate[] aSysRoleRelate)
        throws Exception;

    /**
     * Delete SysRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleRelate(final long aId) throws Exception;

    /**
     * Delete SysRoleRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleRelate(SysRoleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleRelate(SysRoleRelate aSysRoleRelate)
        throws Exception;

    /**
     * Batch Modify SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysRoleRelate(SysRoleRelate[] aSysRoleRelate)
        throws Exception;

    /**
     * Modify SysRoleRelate  By Query Conditions
     *
     * @param aSysRoleRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleRelate(SysRoleRelate aSysRoleRelate,
        SysRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysRoleRelate findSysRoleRelateById(final long aId)
        throws Exception;

    /**
     * Query SysRoleRelate
     *
     * @param aQueryBean
     *
     * @return ISysRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleRelate" containment="true"
     */
    SysRoleRelate[] querySysRoleRelate(SysRoleRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return ISysRoleRelate[]
     *
     * @throws Exception
     *
     * @model type="ISysRoleRelate" containment="true"
     */

    //Map querySysRoleRelateForMap(SysRoleRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysRoleRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysRoleRelateCount(SysRoleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysRoleRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysRoleRelateSelective(SysRoleRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysRoleRelate
     *
     * @param aSysRoleRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleRelate(SysRoleRelate[] aSysRoleRelates,
        SysRoleRelateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysRoleRelate
     *
     * @param aSysRoleRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysRoleRelate(SysRoleRelate[] aSysRoleRelates,
        SysRoleRelateDAOQueryBean aQueryBean,
        SysRoleRelateSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysRoleRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysRoleRelateArray DOCUMENT ME!
         * @param willUpdateSysRoleRelateArray DOCUMENT ME!
         * @param willDeleteSysRoleRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysRoleRelate[] willAddSysRoleRelateArray,
            SysRoleRelate[] willUpdateSysRoleRelateArray,
            SysRoleRelate[] willDeleteSysRoleRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysRoleRelate[] aSysRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysRoleRelate[] aSysRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysRoleRelate[] aSysRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysRoleRelate[] aSysRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysRoleRelate[] aSysRoleRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysRoleRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysRoleRelate[] aSysRoleRelates)
            throws Exception;
    } // end SysRoleRelateSynchronizeCallback
} // end IBaseSysRoleRelateDAO
