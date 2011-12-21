/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统通知配置服务
*  Generated Date 2011-11-24 15:08:27   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISystemNotifyConfigService {
    /**
     * 取得系统通知配置
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    com.ourteam.system.domain.SystemNotifyConfigBean[] getSystemNotifyConfigs()
        throws Exception;
} // end ISystemNotifyConfigService
