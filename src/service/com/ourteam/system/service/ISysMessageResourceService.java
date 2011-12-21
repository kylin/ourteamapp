/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统国际化资源服务
*  Generated Date 2010-07-23 19:38:19   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISysMessageResourceService {
    /**
     * 取得国际化资源
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
     * 添加系统国际化资源
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
     * 添加资源
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
     * 更新资源
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
     * 更新资源
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
     * 删除国际化资源
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
     * 初始化系统资源缓存
     *
     * @throws Exception
     *
     * @model
     */
    void initSysMessageResourceCache() throws Exception;
} // end ISysMessageResourceService
