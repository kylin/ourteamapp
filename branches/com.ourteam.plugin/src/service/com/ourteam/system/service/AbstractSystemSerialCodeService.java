/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 系统序列号服务 Generated Date 2011-10-28 09:57:56
 *
 * @author Auto Gen
 */
abstract class AbstractSystemSerialCodeService extends net.service.DefaultServiceImpl
    implements ISystemSerialCodeService {
    /**
     * DOCUMENT ME!
     */
    protected static final Log logger = LogFactory.getLog(AbstractSystemSerialCodeService.class);

    /** SysSerialCode DAO Instance */
    protected com.ourteam.system.dao.ISysSerialCodeDAO sysSerialCodeDao;

    /**
     * Get SysSerialCode DAO Instance
     *
     * @return DOCUMENT ME!
     */
    public com.ourteam.system.dao.ISysSerialCodeDAO getSysSerialCodeDao() {
        return sysSerialCodeDao;
    } // end getSysSerialCodeDao()

    /**
     * Set SysSerialCode DAO Instance
     *
     * @param aDao DOCUMENT ME!
     */
    public void setSysSerialCodeDao(
        com.ourteam.system.dao.ISysSerialCodeDAO aDao) {
        sysSerialCodeDao = aDao;
    } // end setSysSerialCodeDao()

    /**
     * 取得序列号
     *
     * @param codeType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    protected abstract String doGetSerialCode(final String codeType)
        throws Exception;

    /**
     * 取得序列号
     *
     * @param codeType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public String getSerialCode(final String codeType)
        throws Exception {
        try {
            if (codeType == null) {
                throw new org.apache.commons.lang.NullArgumentException(
                    "The Parameter [codeType] Value is NULL");
            } // end if

            String result = doGetSerialCode(codeType);

            return result;
        } // end try
        catch (Exception e) {
            logger.error("do getSerialCode error", e);
            throw e;
        } // end catch
    } // end getSerialCode()
} // end AbstractSystemSerialCodeService
