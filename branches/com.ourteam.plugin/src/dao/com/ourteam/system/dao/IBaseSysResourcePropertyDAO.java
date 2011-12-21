/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  ISysResourceProperty Data Access Object
*  GenDate 2011-09-22 10:11:16  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseSysResourcePropertyDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "SYS_RESOURCE_PROPERTY";

    /** Attribute */
    static final String Id = "SYS_RESOURCE_PROPERTY.ID";

    /** Attribute */
    static final String Remarks = "SYS_RESOURCE_PROPERTY.REMARKS";

    /** Attribute */
    static final String ResourcePropertyCode = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE";

    /** Attribute */
    static final String ResourcePropertyDefaultValue = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE";

    /** Attribute */
    static final String ResourcePropertyName = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME";

    /** Attribute */
    static final String ResourcePropertyOrder = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER";

    /** Attribute */
    static final String ResourcePropertyType = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE";

    /** Attribute */
    static final String ResourcePropertyValue = "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE";

    /** Attribute */
    static final String Status = "SYS_RESOURCE_PROPERTY.STATUS";

    /** Attribute */
    static final String SysResourceId = "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID";

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
        static final String ResourcePropertyCode = "resourcePropertyCode";

        /** Attribute */
        static final String ResourcePropertyDefaultValue = "resourcePropertyDefaultValue";

        /** Attribute */
        static final String ResourcePropertyName = "resourcePropertyName";

        /** Attribute */
        static final String ResourcePropertyOrder = "resourcePropertyOrder";

        /** Attribute */
        static final String ResourcePropertyType = "resourcePropertyType";

        /** Attribute */
        static final String ResourcePropertyValue = "resourcePropertyValue";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String SysResourceId = "sysResourceId";
    } // end DataProperty

    /**
     * Check Unique SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(SysResourceProperty aSysResourceProperty)
        throws Exception;

    /**
     * insert SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void insertSysResourceProperty(SysResourceProperty aSysResourceProperty)
        throws Exception;

    /**
     * Batch Insert SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertSysResourceProperty(
        SysResourceProperty[] aSysResourceProperty) throws Exception;

    /**
     * Delete SysResourceProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceProperty(final long aId) throws Exception;

    /**
     * Delete SysResourceProperty By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourceProperty(SysResourcePropertyDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceProperty(SysResourceProperty aSysResourceProperty)
        throws Exception;

    /**
     * Batch Modify SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateSysResourceProperty(
        SysResourceProperty[] aSysResourceProperty) throws Exception;

    /**
     * Modify SysResourceProperty  By Query Conditions
     *
     * @param aSysResourceProperty Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourceProperty(SysResourceProperty aSysResourceProperty,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysResourceProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    SysResourceProperty findSysResourcePropertyById(final long aId)
        throws Exception;

    /**
     * Query SysResourceProperty
     *
     * @param aQueryBean
     *
     * @return ISysResourceProperty[]
     *
     * @throws Exception
     *
     * @model type="ISysResourceProperty" containment="true"
     */
    SysResourceProperty[] querySysResourceProperty(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query SysResourceProperty
     *
     * @param aBaseQueryBean
     *
     * @return ISysResourceProperty[]
     *
     * @throws Exception
     *
     * @model type="ISysResourceProperty" containment="true"
     */

    //Map querySysResourcePropertyForMap(SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count SysResourceProperty
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int querySysResourcePropertyCount(
        SysResourcePropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query SysResourceProperty Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] querySysResourcePropertySelective(
        SysResourcePropertyDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize SysResourceProperty
     *
     * @param aSysResourcePropertys
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourceProperty(
        SysResourceProperty[] aSysResourcePropertys,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize SysResourceProperty
     *
     * @param aSysResourcePropertys
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeSysResourceProperty(
        SysResourceProperty[] aSysResourcePropertys,
        SysResourcePropertyDAOQueryBean aQueryBean,
        SysResourcePropertySynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface SysResourcePropertySynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddSysResourcePropertyArray DOCUMENT ME!
         * @param willUpdateSysResourcePropertyArray DOCUMENT ME!
         * @param willDeleteSysResourcePropertyArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            SysResourceProperty[] willAddSysResourcePropertyArray,
            SysResourceProperty[] willUpdateSysResourcePropertyArray,
            SysResourceProperty[] willDeleteSysResourcePropertyArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aSysResourcePropertys DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(SysResourceProperty[] aSysResourcePropertys)
            throws Exception;
    } // end SysResourcePropertySynchronizeCallback

    /**
     * Query Related ISysResourcePropertyOption
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourcePropertyOption" containment="true"
     */
    com.ourteam.system.dao.SysResourcePropertyOption[] querySysResourcePropertyOptions(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related ISysResourcePropertyOption to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourcePropertyOption" containment="true"
     */

    //Map querySysResourcePropertyOptionsForMap(SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related ISysResourcePropertyOption Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] querySysResourcePropertyOptionsSelective(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Update Related ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateSysResourcePropertyOption(
        com.ourteam.system.dao.SysResourcePropertyOption aSysResourcePropertyOption,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related ISysResourcePropertyOption
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteSysResourcePropertyOption(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception;
} // end IBaseSysResourcePropertyDAO
