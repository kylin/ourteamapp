/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessTemplateProviderType Data Access Object
*  GenDate 2011-09-22 10:16:40  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessTemplateProviderTypeDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_TEMPLATE_PROVIDER_TYPE";

    /** Attribute */
    static final String Id = "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID";

    /** Attribute */
    static final String BusinessObjectType = "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE";

    /** Attribute */
    static final String Description = "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION";

    /** Attribute */
    static final String FilePath = "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH";

    /** Attribute */
    static final String ProviderName = "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME";

    /** Attribute */
    static final String ProviderType = "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE";

    /** Attribute */
    static final String Status = "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS";

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
        static final String BusinessObjectType = "businessObjectType";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String FilePath = "filePath";

        /** Attribute */
        static final String ProviderName = "providerName";

        /** Attribute */
        static final String ProviderType = "providerType";

        /** Attribute */
        static final String Status = "status";
    } // end DataProperty

    /**
     * Check Unique BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception;

    /**
     * insert BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception;

    /**
     * Batch Insert BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderType)
        throws Exception;

    /**
     * Delete BusinessTemplateProviderType
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessTemplateProviderType(final long aId)
        throws Exception;

    /**
     * Delete BusinessTemplateProviderType By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessTemplateProviderType(
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception;

    /**
     * Batch Modify BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderType)
        throws Exception;

    /**
     * Modify BusinessTemplateProviderType  By Query Conditions
     *
     * @param aBusinessTemplateProviderType Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessTemplateProviderType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessTemplateProviderType findBusinessTemplateProviderTypeById(
        final long aId) throws Exception;

    /**
     * Query BusinessTemplateProviderType
     *
     * @param aQueryBean
     *
     * @return IBusinessTemplateProviderType[]
     *
     * @throws Exception
     *
     * @model type="IBusinessTemplateProviderType" containment="true"
     */
    BusinessTemplateProviderType[] queryBusinessTemplateProviderType(
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessTemplateProviderType
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessTemplateProviderType[]
     *
     * @throws Exception
     *
     * @model type="IBusinessTemplateProviderType" containment="true"
     */

    //Map queryBusinessTemplateProviderTypeForMap(BusinessTemplateProviderTypeDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessTemplateProviderType
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessTemplateProviderTypeCount(
        BusinessTemplateProviderTypeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessTemplateProviderType Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessTemplateProviderTypeSelective(
        BusinessTemplateProviderTypeDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderTypes
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderTypes,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Synchronize BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderTypes
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderTypes,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean,
        BusinessTemplateProviderTypeSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessTemplateProviderTypeSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessTemplateProviderTypeArray DOCUMENT ME!
         * @param willUpdateBusinessTemplateProviderTypeArray DOCUMENT ME!
         * @param willDeleteBusinessTemplateProviderTypeArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessTemplateProviderType[] willAddBusinessTemplateProviderTypeArray,
            BusinessTemplateProviderType[] willUpdateBusinessTemplateProviderTypeArray,
            BusinessTemplateProviderType[] willDeleteBusinessTemplateProviderTypeArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplateProviderTypes DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(
            BusinessTemplateProviderType[] aBusinessTemplateProviderTypes)
            throws Exception;
    } // end BusinessTemplateProviderTypeSynchronizeCallback
} // end IBaseBusinessTemplateProviderTypeDAO
