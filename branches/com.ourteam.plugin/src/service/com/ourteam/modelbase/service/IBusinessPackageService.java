/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

/**
*  ҵ���������
*  Generated Date 2010-10-12 11:48:53   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBusinessPackageService {
    /**
     * ȡ��ҵ���
     *
     * @param aBusinessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessPackageBean[] getBusinessPackages(
        final long aBusinessDomainId) throws Exception;

    /**
     * ��ݰ�����ȡ��ҵ���
     *
     * @param aDomainId
     * @param aBusinessPackageType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessPackageBean[] getBusinessPackagesByType(
        final long aDomainId,
        final com.ourteam.modelbase.domain.BusinessPackageTypeEnum aBusinessPackageType)
        throws Exception;

    /**
     * �޸�ҵ���
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean aBusinessPackage)
        throws Exception;

    /**
     * ���ҵ���
     *
     * @param businessPackageBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessPackage(
        final com.ourteam.modelbase.domain.BusinessPackageBean businessPackageBean)
        throws Exception;

    /**
     * ɾ��ҵ���
     *
     * @param packageId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessPackage(final long packageId) throws Exception;

    /**
     * ��ѯҵ���
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessPackageBean[] queryBusinessPackages(
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
     *
     * @model
     */
    int queryBusinessPackageCount(
        final com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean queryBean)
        throws Exception;

    /**
     * ���idȡ��ҵ������
     *
     * @param packageId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessPackageBean getBusinessPackageById(
        final long packageId) throws Exception;
} // end IBusinessPackageService
