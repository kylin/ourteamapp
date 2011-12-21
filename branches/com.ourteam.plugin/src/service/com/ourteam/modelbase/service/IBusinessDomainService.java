/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.service;

/**
*  ҵ����������
*  Generated Date 2011-05-31 15:23:24   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface IBusinessDomainService {
    /**
     * ȡ������ҵ����
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] getAllBusinessDomains()
        throws Exception;

    /**
     * �޸�ҵ������Ϣ
     *
     * @param businessDomainBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean businessDomainBean)
        throws Exception;

    /**
     * ���ҵ����
     *
     * @param aBusinessDomainBean
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessDomain(
        final com.ourteam.modelbase.domain.BusinessDomainBean aBusinessDomainBean)
        throws Exception;

    /**
     * ɾ��ҵ����
     *
     * @param aBusinessDomainId
     *
     * @throws Exception
     *
     * @model
     */
    void deleteBusinessDomain(final long aBusinessDomainId)
        throws Exception;

    /**
     * ����IDȡ��ҵ����
     *
     * @param businessDomainId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean getBusinessDomainById(
        final long businessDomainId) throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] queryBusinessDomain(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception;

    /**
     * 
    DOCUMENT ME!
     *
     * @param queryBean
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    int queryBusinessDomainCount(
        final com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean queryBean)
        throws Exception;

    /**
     * ȡ������ҵ��������Ϣ
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainGroupBean[] getAllBusinessDomainGroups()
        throws Exception;

    /**
     * ������IDȡ��ҵ������Ϣ
     *
     * @param businessDomainGroupId
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.modelbase.domain.BusinessDomainBean[] getBusinessDomainsByGroupId(
        final long businessDomainGroupId) throws Exception;

    /**
     * ����ҵ��������Ĺ�����ϵ
     *
     * @param businessDomainGroupId
     * @param businessDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void setBusinessDomainGroupRelate(final long businessDomainGroupId,
        final long[] businessDomainIds) throws Exception;

    /**
     * �½�ҵ�������
     *
     * @param businessDomainGroupBean
     * @param businessDomainIds
     *
     * @throws Exception
     *
     * @model
     */
    void addNewBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean,
        final long[] businessDomainIds) throws Exception;

    /**
     * ɾ��ҵ�������
     *
     * @param businessDomainGroupId
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessDomainGroup(final long businessDomainGroupId)
        throws Exception;

    /**
     * ����ɾ��ҵ�������
     *
     * @param businessDomainGroupIds
     *
     * @throws Exception
     *
     * @model
     */
    void removeBusinessDomainGroups(final long[] businessDomainGroupIds)
        throws Exception;

    /**
     * �༭ҵ���������Ϣ
     *
     * @param businessDomainGroupBean
     *
     * @throws Exception
     *
     * @model
     */
    void modifyBusinessDomainGroup(
        final com.ourteam.modelbase.domain.BusinessDomainGroupBean businessDomainGroupBean)
        throws Exception;
} // end IBusinessDomainService
