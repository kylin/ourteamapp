/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.service;

import com.ourteam.bpm.service.IBPMService;

import net.service.SpringContextAgent;


/**
 * 流程服务接口 GenDate 2011-12-20 22:33:22
 *
 * @author Auto Gen
 */
public class BPMServiceFactory {
    /**
     * Get IBPMService Instance
     *
     * @return DOCUMENT ME!
     */
    public static IBPMService getBPMService() {
        return (IBPMService) SpringContextAgent.getBean(IBPMService.class.getName());
    } // end getBPMService()
} // end BPMServiceFactory
