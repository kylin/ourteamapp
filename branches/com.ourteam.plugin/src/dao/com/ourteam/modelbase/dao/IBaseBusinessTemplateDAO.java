/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.IDataAccessObject;

import java.util.Map;


/**
*  IBusinessTemplate Data Access Object
*  GenDate 2011-09-22 10:16:39  
*  @model  interface="true"
*  @author Auto Generate        
*/
public interface IBaseBusinessTemplateDAO extends IDataAccessObject {
    /** Entity Name */
    static final String EntityName = "BUSINESS_TEMPLATE";

    /** Attribute */
    static final String Id = "BUSINESS_TEMPLATE.ID";

    /** Attribute */
    static final String BusinessObjectType = "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE";

    /** Attribute */
    static final String ProviderTypeId = "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID";

    /** Attribute */
    static final String Description = "BUSINESS_TEMPLATE.DESCRIPTION";

    /** Attribute */
    static final String Status = "BUSINESS_TEMPLATE.STATUS";

    /** Attribute */
    static final String TemplateId = "BUSINESS_TEMPLATE.TEMPLATE_ID";

    /** Attribute */
    static final String TemplateName = "template.TEMPLATE_NAME";

    /** Attribute */
    static final String TemplateDescription = "template.DESCRIPTION";

    /** Attribute */
    static final String FileName = "BUSINESS_TEMPLATE.FILE_NAME";

    /** Attribute */
    static final String Name = "BUSINESS_TEMPLATE.NAME";

    /** Attribute */
    static final String CanOverWrite = "BUSINESS_TEMPLATE.CAN_OVER_WRITE";

    /** Attribute */
    static final String FileType = "BUSINESS_TEMPLATE.FILE_TYPE";

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
        static final String ProviderTypeId = "providerTypeId";

        /** Attribute */
        static final String Description = "description";

        /** Attribute */
        static final String Status = "status";

        /** Attribute */
        static final String TemplateId = "templateId";

        /** Attribute */
        static final String TemplateName = "templateName";

        /** Attribute */
        static final String TemplateDescription = "templateDescription";

        /** Attribute */
        static final String FileName = "fileName";

        /** Attribute */
        static final String Name = "name";

        /** Attribute */
        static final String CanOverWrite = "canOverWrite";

        /** Attribute */
        static final String FileType = "fileType";
    } // end DataProperty

    /**
     * Check Unique BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    boolean checkIsUnique(BusinessTemplate aBusinessTemplate)
        throws Exception;

    /**
     * insert BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void insertBusinessTemplate(BusinessTemplate aBusinessTemplate)
        throws Exception;

    /**
     * Batch Insert BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void batchInsertBusinessTemplate(BusinessTemplate[] aBusinessTemplate)
        throws Exception;

    /**
     * Delete BusinessTemplate
     *
     * @param aId long aId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessTemplate(final long aId) throws Exception;

    /**
     * Delete BusinessTemplate By Query Conditions
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessTemplate(BusinessTemplateDAOQueryBean aQueryBean)
        throws Exception;

    /**
     * Modify BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessTemplate(BusinessTemplate aBusinessTemplate)
        throws Exception;

    /**
     * Batch Modify BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     *
     * @model
     */
    void batchUpdateBusinessTemplate(BusinessTemplate[] aBusinessTemplate)
        throws Exception;

    /**
     * Modify BusinessTemplate  By Query Conditions
     *
     * @param aBusinessTemplate Update Value
     * @param aQueryBean Update Condiction
     *
     * @throws Exception
     *
     * @model
     */
    void updateBusinessTemplate(BusinessTemplate aBusinessTemplate,
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessTemplate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     *
     * @model
     */
    BusinessTemplate findBusinessTemplateById(final long aId)
        throws Exception;

    /**
     * Query BusinessTemplate
     *
     * @param aQueryBean
     *
     * @return IBusinessTemplate[]
     *
     * @throws Exception
     *
     * @model type="IBusinessTemplate" containment="true"
     */
    BusinessTemplate[] queryBusinessTemplate(
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Query BusinessTemplate
     *
     * @param aBaseQueryBean
     *
     * @return IBusinessTemplate[]
     *
     * @throws Exception
     *
     * @model type="IBusinessTemplate" containment="true"
     */

    //Map queryBusinessTemplateForMap(BusinessTemplateDAOQueryBean aQueryBean) throws Exception;
    /**
     * Query Count BusinessTemplate
     *
     * @param aBaseQueryBean
     *
     * @return long
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessTemplateCount(BusinessTemplateDAOQueryBean aBaseQueryBean)
        throws Exception;

    /**
     * Query BusinessTemplate Selective
     *
     * @param aBaseQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    Map[] queryBusinessTemplateSelective(
        BusinessTemplateDAOQueryBean aBaseQueryBean) throws Exception;

    /**
     * Synchronize BusinessTemplate
     *
     * @param aBusinessTemplates
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessTemplate(BusinessTemplate[] aBusinessTemplates,
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception;

    /**
     * Synchronize BusinessTemplate
     *
     * @param aBusinessTemplates
     * @param aQueryBean
     * @param aCallBack
     *
     * @throws Exception
     *
     * @model
     */
    void synchronizeBusinessTemplate(BusinessTemplate[] aBusinessTemplates,
        BusinessTemplateDAOQueryBean aQueryBean,
        BusinessTemplateSynchronizeCallback aCallBack)
        throws Exception;

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    interface BusinessTemplateSynchronizeCallback {
        /**
         * DOCUMENT ME!
         *
         * @param willAddBusinessTemplateArray DOCUMENT ME!
         * @param willUpdateBusinessTemplateArray DOCUMENT ME!
         * @param willDeleteBusinessTemplateArray DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void checkSynchronizeObjects(
            BusinessTemplate[] willAddBusinessTemplateArray,
            BusinessTemplate[] willUpdateBusinessTemplateArray,
            BusinessTemplate[] willDeleteBusinessTemplateArray)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeDelete(BusinessTemplate[] aBusinessTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterDelete(BusinessTemplate[] aBusinessTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeInsert(BusinessTemplate[] aBusinessTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterInsert(BusinessTemplate[] aBusinessTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void beforeUpdate(BusinessTemplate[] aBusinessTemplates)
            throws Exception;

        /**
         * DOCUMENT ME!
         *
         * @param aBusinessTemplates DOCUMENT ME!
         *
         * @throws Exception DOCUMENT ME!
         */
        void afterUpdate(BusinessTemplate[] aBusinessTemplates)
            throws Exception;
    } // end BusinessTemplateSynchronizeCallback
} // end IBaseBusinessTemplateDAO
