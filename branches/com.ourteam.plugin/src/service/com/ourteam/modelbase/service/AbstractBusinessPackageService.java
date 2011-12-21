/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ҵ��������� Generated Date 2010-10-12 11:48:58
 *
 * @author Auto Gen
 */
abstract class AbstractBusinessPackageService extends net.service.DefaultServiceImpl
    implements IBusinessPackageService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractBusinessPackageService.class);

    /** BusinessPackage DAO Instance */
    protected com.ourteam.modelbase.dao.IBusinessPackageDAO businessPackageDao;

    /**
     * Get BusinessPackage DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.modelbase.dao.IBusinessPackageDAO getBusinessPackageDao() {
        return businessPackageDao;
    } // end getBusinessPackageDao()

    /**
     * Set BusinessPackage DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setBusinessPackageDao(
        com.ourteam.modelbase.dao.IBusinessPackageDAO aDao) {
        businessPackageDao = aDao;
    } // end setBusinessPackageDao()

    /**
     * ȡ��ҵ���
     *
     * @param aBusinessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessPackageBean[] doGetBusinessPackages(
        final long aBusinessDomainId) throws Exception;

    /**
     * ȡ��ҵ���
     *
     * @param aBusinessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessPackageBean[] getBusinessPackages(
        final long aBusinessDomainId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessPackageBean[] result = doGetBusinessPackages(aBusinessDomainId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessPackages error", e);
            throw e;
        } // end catch
    } // end getBusinessPackages()

    /**
     * ��ݰ�����ȡ��ҵ���
     *
     * @param aDomainId
     * @param aBusinessPackageType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessPackageBean[] doGetBusinessPackagesByType(
        final long aDomainId,
        final com.ourteam.modelbase.domain.BusinessPackageTypeEnum aBusinessPackageType)
        throws Exception;

    /**
     * ��ݰ�����ȡ��ҵ���
     *
     * @param aDomainId
     * @param aBusinessPackageType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessPackageBean[] getBusinessPackagesByType(
        final long aDomainId,
        final com.ourteam.modelbase.domain.BusinessPackageTypeEnum aBusinessPackageType)
        throws Exception {
        try {
            if (aBusinessPackageType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aBusinessPackageType] Value is NULL");
            } // end if

            com.ourteam.modelbase.domain.BusinessPackageBean[] result = doGetBusinessPackagesByType(aDomainId,
                    aBusinessPackageType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessPackagesByType error", e);
            throw e;
        } // end catch
    } // end getBusinessPackagesByType()

    /**
     * �޸�ҵ���
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    protected abstract void doModifyBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean aBusinessPackage)
        throws Exception;

    /**
     * �޸�ҵ���
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    public void modifyBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean aBusinessPackage)
        throws Exception {
        try {
            if (aBusinessPackage == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [aBusinessPackage] Value is NULL");
            } // end if

            doModifyBusinessPackage(aBusinessPackage);
        } // end try
        catch (Exception e) {
            logger.error("do modifyBusinessPackage error", e);
            throw e;
        } // end catch
    } // end modifyBusinessPackage()

    /**
     * ���ҵ���
     *
     * @param businessPackageBean
     *
     * @throws Exception
     */
    protected abstract void doAddNewBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean businessPackageBean)
        throws Exception;

    /**
     * ���ҵ���
     *
     * @param businessPackageBean
     *
     * @throws Exception
     */
    public void addNewBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean businessPackageBean)
        throws Exception {
        try {
            if (businessPackageBean == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [businessPackageBean] Value is NULL");
            } // end if

            doAddNewBusinessPackage(businessPackageBean);
        } // end try
        catch (Exception e) {
            logger.error("do addNewBusinessPackage error", e);
            throw e;
        } // end catch
    } // end addNewBusinessPackage()

    /**
     * ɾ��ҵ���
     *
     * @param packageId
     *
     * @throws Exception
     */
    protected abstract void doDeleteBusinessPackage(final long packageId)
        throws Exception;

    /**
     * ɾ��ҵ���
     *
     * @param packageId
     *
     * @throws Exception
     */
    public void deleteBusinessPackage(final long packageId)
        throws Exception {
        try {
            doDeleteBusinessPackage(packageId);
        } // end try
        catch (Exception e) {
            logger.error("do deleteBusinessPackage error", e);
            throw e;
        } // end catch
    } // end deleteBusinessPackage()

    /**
     * ��ѯҵ���
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessPackageBean[] doQueryBusinessPackages(
        final com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯҵ���
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessPackageBean[] queryBusinessPackages(
        final com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean queryBean)
        throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessPackageBean[] result = doQueryBusinessPackages(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessPackages error", e);
            throw e;
        } // end catch
    } // end queryBusinessPackages()

    /**
     * ��ѯҵ�������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract int doQueryBusinessPackageCount(
        final com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean queryBean)
        throws Exception;

    /**
     * ��ѯҵ�������
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public int queryBusinessPackageCount(
        final com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean queryBean)
        throws Exception {
        try {
            int result = doQueryBusinessPackageCount(queryBean);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do queryBusinessPackageCount error", e);
            throw e;
        } // end catch
    } // end queryBusinessPackageCount()

    /**
     * ���idȡ��ҵ������
     *
     * @param packageId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.modelbase.domain.BusinessPackageBean doGetBusinessPackageById(
        final long packageId) throws Exception;

    /**
     * ���idȡ��ҵ������
     *
     * @param packageId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.modelbase.domain.BusinessPackageBean getBusinessPackageById(
        final long packageId) throws Exception {
        try {
            com.ourteam.modelbase.domain.BusinessPackageBean result = doGetBusinessPackageById(packageId);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getBusinessPackageById error", e);
            throw e;
        } // end catch
    } // end getBusinessPackageById()
} // end AbstractBusinessPackageService
