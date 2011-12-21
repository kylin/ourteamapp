/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessDomainGroupRelate Data Access Object
*  GenDate 2011-09-22 10:16:35  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessDomainGroupRelateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_DOMAIN_GROUP_RELATE";

    /** Attribute */
    static final String Id = "BUSINESS_DOMAIN_GROUP_RELATE.ID";

    /** Attribute */
    static final String DomainId = "BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID";

    /** Attribute */
    static final String GroupId = "BUSINESS_DOMAIN_GROUP_RELATE.GROUP_ID";

    /** Attribute */
    static final String Remarks = "BUSINESS_DOMAIN_GROUP_RELATE.REMARKS";

    /** Attribute */
    static final String Status = "BUSINESS_DOMAIN_GROUP_RELATE.STATUS";

    /** Attribute */
    static final String DomainName = "businessDomainB.NAME";

    /** Attribute */
    static final String GroupName = "businessDomainGroupB.GROUP_NAME";

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
        static final String GroupId = "groupId";

        /** Attribute */
        static final String Remarks = "remarks";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String GroupName = "groupName";
    } // end DataProperty

    /**
     * Check Unique BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception;

    /**
     * insert BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception;

    /**
     * Batch Insert BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelate)
        throws Exception;

    /**
     * Delete BusinessDomainGroupRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomainGroupRelate(final long aId)
        throws Exception;

    /**
     * Delete BusinessDomainGroupRelate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomainGroupRelate(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception;

    /**
     * Batch Modify BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelate)
        throws Exception;

    /**
     * Modify BusinessDomainGroupRelate  By Query Conditions
     *
     * @param aBusinessDomainGroupRelate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessDomainGroupRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessDomainGroupRelate findBusinessDomainGroupRelateById(final long aId)
        throws Exception;

    /**
     * Query BusinessDomainGroupRelate
     *
     * @param aQueryBean
     *
     * @return IBusinessDomainGroupRelate[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomainGroupRelate" containment="true"
     */
    BusinessDomainGroupRelate[] queryBusinessDomainGroupRelate(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessDomainGroupRelate
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessDomainGroupRelate[]
     *
     * @throws Exception
     *
     * @model type="IBusinessDomainGroupRelate" containment="true"
     */

    //Map queryBusinessDomainGroupRelateForMap(BusinessDomainGroupRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessDomainGroupRelate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessDomainGroupRelateCount(
        BusinessDomainGroupRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessDomainGroupRelate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessDomainGroupRelateSelective(
        BusinessDomainGroupRelateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelates,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelates,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean,
        BusinessDomainGroupRelateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessDomainGroupRelateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessDomainGroupRelateArray DOCUMENT ME!
         * @param willUpdateBusinessDomainGroupRelateArray DOCUMENT ME!
         * @param willDeleteBusinessDomainGroupRelateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessDomainGroupRelate[] willAddBusinessDomainGroupRelateArray,
            BusinessDomainGroupRelate[] willUpdateBusinessDomainGroupRelateArray,
            BusinessDomainGroupRelate[] willDeleteBusinessDomainGroupRelateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessDomainGroupRelates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            BusinessDomainGroupRelate[] aBusinessDomainGroupRelates)
            throws Exception;
    } // end BusinessDomainGroupRelateSynchronizeCallback

    /**
     * Query Related IBusinessDomain
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IBusinessDomain" containment="true"
     */
    com.ourteam.modelbase.dao.BusinessDomain[] queryBusinessDomains(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query Related IBusinessDomain to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IBusinessDomain" containment="true"
     */

    //Map queryBusinessDomainsForMap(BusinessDomainGroupRelateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IBusinessDomain Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryBusinessDomainsSelective(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IBusinessDomain
     *
     * @param aBusinessDomain {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessDomain(
        com.ourteam.modelbase.dao.BusinessDomain aBusinessDomain,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Delete Related IBusinessDomain
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomain(BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseBusinessDomainGroupRelateDAO
