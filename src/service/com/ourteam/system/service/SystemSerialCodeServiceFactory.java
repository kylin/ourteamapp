/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import com.ourteam.system.service.ISystemSerialCodeService;

import net.service.SpringContextAgent;


/**
 * 系统序列号服务 GenDate 2011-10-28 09:57:26
 *
 * @author Auto Gen
 */
public class SystemSerialCodeServiceFactory {
    /**
     * Get ISystemSerialCodeService Instance
     *
     * @return DOCUMENT ME!
     */
    public static ISystemSerialCodeService getSystemSerialCodeService() {
        return (ISystemSerialCodeService) SpringContextAgent.getBean(ISystemSerialCodeService.class.getName());
    } // end getSystemSerialCodeService()
} // end SystemSerialCodeServiceFactory
