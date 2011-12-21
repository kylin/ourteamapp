/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysAction Data Access Object
*  GenDate 2011-11-07 10:18:29  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysActionDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_ACTION";

    /** Attribute */
    static final String Id = "SYS_ACTION.ID";

    /** Attribute */
    static final String ModuleId = "SYS_ACTION.MODULE_ID";

    /** Attribute */
    static final String ActionCode = "SYS_ACTION.ACTION_CODE";

    /** Attribute */
    static final String ActionName = "SYS_ACTION.ACTION_NAME";

    /** Attribute */
    static final String DomainId = "SYS_ACTION.DOMAIN_ID";

    /** Attribute */
    static final String Remarks = "SYS_ACTION.REMARKS";

    /** Attribute */
    static final String Status = "SYS_ACTION.STATUS";

    /** Attribute */
    static final String DomainCode = "sysDomainA.DOMAIN_CODE";

    /** Attribute */
    static final String DomainName = "sysDomainA.DOMAIN_NAME";

    /** Attribute */
    static final String ModuleCode = "sysModuleA.MODULE_CODE";

    /** Attribute */
    static final String ModuleName = "sysModuleA.MODULE_NAME";

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
        static final String ModuleId = "moduleId";

        /** Attribute */
        static final String ActionCode = "actionCode";

        /** Attribute */
        static final String ActionName = "actionName";

        /** Attribute */
        static final String DomainId = "domainId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DomainCode = "domainCode";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String ModuleCode = "moduleCode";

        /** Attribute */
        static final String ModuleName = "moduleName";
    } // end DataProperty

    /**
     * Check Unique SysAction
     *
     * @param aSysAction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysAction aSysAction) throws Exception;

    /**
     * insert SysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysAction(SysAction aSysAction) throws Exception;

    /**
     * Batch Insert SysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysAction(SysAction[] aSysAction) throws Exception;

    /**
     * Delete SysAction
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysAction(final long aId) throws Exception;

    /**
     * Delete SysAction By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysAction(SysActionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysAction(SysAction aSysAction) throws Exception;

    /**
     * Batch Modify SysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysAction(SysAction[] aSysAction) throws Exception;

    /**
     * Modify SysAction  By Query Conditions
     *
     * @param aSysAction Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysAction(SysAction aSysAction, SysActionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysAction
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysAction findSysActionById(final long aId) throws Exception;

    /**
     * Query SysAction
     *
     * @param aQueryBean
     *
     * @return ISysAction[]
     *
     * @throws Exception
     *
     * @model type="ISysAction" containment="true"
     */
    SysAction[] querySysAction(SysActionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query SysAction
     *
     * @param aBaseQueryBean
     *
     * @return ISysAction[]
     *
     * @throws Exception
     *
     * @model type="ISysAction" containment="true"
     */

    //Map querySysActionForMap(SysActionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysAction
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysActionCount(SysActionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysAction Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysActionSelective(SysActionDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysAction
     *
     * @param aSysActions
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysAction(SysAction[] aSysActions,
        SysActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysAction
     *
     * @param aSysActions
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysAction(SysAction[] aSysActions,
        SysActionDAOQueryBean aQueryBean, SysActionSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysActionSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysActionArray DOCUMENT ME!
         * @param willUpdateSysActionArray DOCUMENT ME!
         * @param willDeleteSysActionArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(SysAction[] willAddSysActionArray,
            SysAction[] willUpdateSysActionArray,
            SysAction[] willDeleteSysActionArray) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysAction[] aSysActions) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysAction[] aSysActions) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysAction[] aSysActions) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysAction[] aSysActions) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysAction[] aSysActions) throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysActions DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysAction[] aSysActions) throws Exception;
    } // end SysActionSynchronizeCallback

    /**
     * Query Related ISysRoleActionRelate
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleActionRelate" containment="true"
     */
    com.ourteam.system.dao.SysRoleActionRelate[] querySysRoleActionRelates(
        SysActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysRoleActionRelate to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleActionRelate" containment="true"
     */

    //Map querySysRoleActionRelatesForMap(SysActionDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysRoleActionRelate Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysRoleActionRelatesSelective(SysActionDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysRoleActionRelate(
        com.ourteam.system.dao.SysRoleActionRelate aSysRoleActionRelate,
        SysActionDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysRoleActionRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysRoleActionRelate(SysActionDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseSysActionDAO
