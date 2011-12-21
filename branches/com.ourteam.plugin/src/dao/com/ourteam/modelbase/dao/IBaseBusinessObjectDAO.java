/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessObject Data Access Object
*  GenDate 2011-09-22 10:16:36  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessObjectDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_OBJECT";

    /** Attribute */
    static final String BusinessObjectId = "BUSINESS_OBJECT.BUSINESS_OBJECT_ID";

    /** Attribute */
    static final String Description = "BUSINESS_OBJECT.DESCRIPTION";

    /** Attribute */
    static final String GenerateOption = "BUSINESS_OBJECT.GENERATE_OPTION";

    /** Attribute */
    static final String Name = "BUSINESS_OBJECT.NAME";

    /** Attribute */
    static final String PackageId = "BUSINESS_OBJECT.PACKAGE_ID";

    /** Attribute */
    static final String State = "BUSINESS_OBJECT.STATE";

    /** Attribute */
    static final String Type = "BUSINESS_OBJECT.TYPE";

    /** Attribute */
    static final String DomainId = "package.BUSINESS_DOMAIN_ID";

    /** Attribute */
    static final String DomainName = "domain.NAME";

    /** Attribute */
    static final String PackageName = "package.NAME";

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface DataProperty {
        /** Attribute */
        static final String BusinessObjectId = "businessObjectId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String GenerateOption = "generateOption";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String PackageId = "packageId";

        /** Attribute */
        static final String State = "state";

        /** Attribute */
        static final String Type = "type";

        /** Attribute */
        static final String DomainId = "domainId";

        /** Attribute */
        static final String DomainName = "domainName";

        /** Attribute */
        static final String PackageName = "packageName";
    } // end DataProperty

    /**
     * Check Unique BusinessObject
     *
     * @param aBusinessObject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessObject aBusinessObject)
        throws Exception;

    /**
     * insert BusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessObject(BusinessObject aBusinessObject)
        throws Exception;

    /**
     * Batch Insert BusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessObject(BusinessObject[] aBusinessObject)
        throws Exception;

    /**
     * Delete BusinessObject
     *
     * @param aBusinessObjectId long aBusinessObjectId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObject(final long aBusinessObjectId)
        throws Exception;

    /**
     * Delete BusinessObject By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessObject(BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessObject(BusinessObject aBusinessObject)
        throws Exception;

    /**
     * Batch Modify BusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessObject(BusinessObject[] aBusinessObject)
        throws Exception;

    /**
     * Modify BusinessObject  By Query Conditions
     *
     * @param aBusinessObject Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessObject(BusinessObject aBusinessObject,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessObject
     *
     * @param aBusinessObjectId long aBusinessObjectId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessObject findBusinessObjectById(final long aBusinessObjectId)
        throws Exception;

    /**
     * Query BusinessObject
     *
     * @param aQueryBean
     *
     * @return IBusinessObject[]
     *
     * @throws Exception
     *
     * @model type="IBusinessObject" containment="true"
     */
    BusinessObject[] queryBusinessObject(BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Query BusinessObject
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessObject[]
     *
     * @throws Exception
     *
     * @model type="IBusinessObject" containment="true"
     */

    //Map queryBusinessObjectForMap(BusinessObjectDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessObject
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessObjectCount(BusinessObjectDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessObject Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessObjectSelective(
        BusinessObjectDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BusinessObject
     *
     * @param aBusinessObjects
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessObject(BusinessObject[] aBusinessObjects,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessObject
     *
     * @param aBusinessObjects
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessObject(BusinessObject[] aBusinessObjects,
        BusinessObjectDAOQueryBean aQueryBean,
        BusinessObjectSynchronizeCallback aCallBack) throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessObjectSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessObjectArray DOCUMENT ME!
         * @param willUpdateBusinessObjectArray DOCUMENT ME!
         * @param willDeleteBusinessObjectArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessObject[] willAddBusinessObjectArray,
            BusinessObject[] willUpdateBusinessObjectArray,
            BusinessObject[] willDeleteBusinessObjectArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessObject[] aBusinessObjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessObject[] aBusinessObjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessObject[] aBusinessObjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessObject[] aBusinessObjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessObject[] aBusinessObjects)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessObjects DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessObject[] aBusinessObjects)
            throws Exception;
    } // end BusinessObjectSynchronizeCallback

    /**
     * Query Related IObjectProperty
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectProperty" containment="true"
     */
    com.ourteam.modelbase.dao.ObjectProperty[] queryObjectPropertys(
        BusinessObjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query Related IObjectProperty to Map
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectProperty" containment="true"
     */

    //Map queryObjectPropertysForMap(BusinessObjectDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Related IObjectProperty Selective
     *
     * @param aQueryBean {relatAttr.property.capName}
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="java.util.Map" containment="true"
     */
    Map[] queryObjectPropertysSelective(BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Update Related IObjectProperty
     *
     * @param aObjectProperty {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void updateObjectProperty(
        com.ourteam.modelbase.dao.ObjectProperty aObjectProperty,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception;

    /**
     * Delete Related IObjectProperty
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteObjectProperty(BusinessObjectDAOQueryBean aQueryBean)
        throws Exception;
} // end IBaseBusinessObjectDAO
