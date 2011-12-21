/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  ϵͳ���ʻ���Դ����
*  Generated Date 2010-07-23 19:38:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysMessageResourceService {
    /**
     * ȡ�ù��ʻ���Դ
     *
     * @param aMessagekey
     * @param aLocal
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.MessageResource getSysMessageResource(
        String aMessagekey, String aLocal) throws Exception;

    /**
     * ���ϵͳ���ʻ���Դ
     *
     * @param aMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void addSysMessageResource(
        final com.ourteam.system.domain.MessageResource aMessageResource)
        throws Exception;

    /**
     * �����Դ
     *
     * @param aMessageKey
     * @param aMessageValue
     * @param aLocal
     *
     * @throws Exception
     *
     * @model
     */
    void addSysMessageResource(final String aMessageKey,
        final String aMessageValue, final java.util.Locale aLocal)
        throws Exception;

    /**
     * ������Դ
     *
     * @param aMessageResource
     *
     * @throws Exception
     *
     * @model
     */
    void updateMessageResource(
        final com.ourteam.system.domain.MessageResource aMessageResource)
        throws Exception;

    /**
     * ������Դ
     *
     * @param aMessageKey
     * @param aMessageValue
     * @param aLocal
     *
     * @throws Exception
     *
     * @model
     */
    void updateMessageResource(final String aMessageKey,
        final String aMessageValue, final java.util.Locale aLocal)
        throws Exception;

    /**
     * ɾ�����ʻ���Դ
     *
     * @param aMessageKey
     *
     * @throws Exception
     *
     * @model
     */
    void deleteMessageResource(final String aMessageKey)
        throws Exception;

    /**
     * ��ʼ��ϵͳ��Դ����
     *
     * @throws Exception
     *
     * @model
     */
    void initSysMessageResourceCache() throws Exception;
} // end ISysMessageResourceService
