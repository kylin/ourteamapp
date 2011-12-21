/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

/**
*  系统序列号服务
*  Generated Date 2011-10-28 09:57:25   
*  @model  interface="true"
*  @author Auto Gen
*/
public interface ISystemSerialCodeService {
    /**
     * 取得序列号
     *
     * @param codeType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model
     */
    String getSerialCode(final String codeType) throws Exception;
} // end ISystemSerialCodeService
