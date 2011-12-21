/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * ϵͳ֪ͨ���÷��� Generated Date 2011-11-24 15:09:14
 *
 * @author Auto Gen
 */
abstract class AbstractSystemNotifyConfigService extends net.service.DefaultServiceImpl
    implements ISystemNotifyConfigService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractSystemNotifyConfigService.class);

    /** SysNotifyConfig DAO Instance */
    protected com.ourteam.system.dao.ISysNotifyConfigDAO sysNotifyConfigDao;

    /**
     * Get SysNotifyConfig DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysNotifyConfigDAO getSysNotifyConfigDao() {
        return sysNotifyConfigDao;
    } // end getSysNotifyConfigDao()

    /**
     * Set SysNotifyConfig DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysNotifyConfigDao(
        com.ourteam.system.dao.ISysNotifyConfigDAO aDao) {
        sysNotifyConfigDao = aDao;
    } // end setSysNotifyConfigDao()

    /**
     * ȡ��ϵͳ֪ͨ����
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract com.ourteam.system.domain.SystemNotifyConfigBean[] doGetSystemNotifyConfigs()
        throws Exception;

    /**
     * ȡ��ϵͳ֪ͨ����
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public com.ourteam.system.domain.SystemNotifyConfigBean[] getSystemNotifyConfigs()
        throws Exception {
        try {
            com.ourteam.system.domain.SystemNotifyConfigBean[] result = doGetSystemNotifyConfigs();

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSystemNotifyConfigs error", e);
            throw e;
        } // end catch
    } // end getSystemNotifyConfigs()
} // end AbstractSystemNotifyConfigService
