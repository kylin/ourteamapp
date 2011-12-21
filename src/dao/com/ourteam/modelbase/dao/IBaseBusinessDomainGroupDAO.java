/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessDomainGroup Data Access Object
*  GenDate 2011-09-22 10:16:35  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessDomainGroupDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_DOMAIN_GROUP";

    /** Attribute */
    static final String Id = "BUSINESS_DOMAIN_GROUP.ID";

    /** Attribute */
    static final String GroupName = "BUSINESS_DOMAIN_GROUP.GROUP_NAME";

    /** Attribute */
    static final String Remarks = "BUSINESS_DOMAIN_GROUP.REMARKS";

    /** Attribute */
    static final String Status = "BUSINESS_DOMAIN_GROUP.STATUS";

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
        static final String GroupName = "groupName";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessDomainGroup aBusinessDomainGroup)
        throws Exception;

    /**
     * insert BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessDomainGroup(BusinessDomainGroup aBusinessDomainGroup)
        throws Exception;

    /**
     * Batch Insert BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroup) throws Exception;

    /**
     * Delete BusinessDomainGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomainGroup(final long aId) throws Exception;

    /**
     * Delete BusinessDomainGroup By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomainGroup(BusinessDomainGroupDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomainGroup(BusinessDomainGroup aBusinessDomainGroup)
        throws Exception;

    /**
     * Batch Modify BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroup) throws Exception;

    /**
     * Modify BusinessDomainGroup  By Query Conditions
     *
     * @param aBusinessDomainGroup Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomainGroup(BusinessDomainGroup aBusinessDomainGroup,
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessDomainGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessDomainGroup findBusinessDomainGroupById(final long aId)
        throws Exception;

    /**
     * Query BusinessDomainGroup
     *
     * @param aQueryBean
     *
     * @return IBusinessDomainGroup[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomainGroup" containment="true"
     */
    BusinessDomainGroup[] queryBusinessDomainGroup(
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessDomainGroup
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessDomainGroup[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomainGroup" containment="true"
     */

    //Map queryBusinessDomainGroupForMap(BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessDomainGroup
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessDomainGroupCount(
        BusinessDomainGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessDomainGroup Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessDomainGroupSelective(
        BusinessDomainGroupDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessDomainGroup
     *
     * @param aBusinessDomainGroups
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroups,
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessDomainGroup
     *
     * @param aBusinessDomainGroups
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroups,
        BusinessDomainGroupDAOQueryBean aQueryBean,
        BusinessDomainGroupSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessDomainGroupSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessDomainGroupArray DOCUMENT ME!
         * @param willUpdateBusinessDomainGroupArray DOCUMENT ME!
         * @param willDeleteBusinessDomainGroupArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessDomainGroup[] willAddBusinessDomainGroupArray,
            BusinessDomainGroup[] willUpdateBusinessDomainGroupArray,
            BusinessDomainGroup[] willDeleteBusinessDomainGroupArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroups DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessDomainGroup[] aBusinessDomainGroups)
            throws Exception;
    } // end BusinessDomainGroupSynchronizeCallback
} // end IBaseBusinessDomainGroupDAO
