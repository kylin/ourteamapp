/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import com.ourteam.system.dao.ISysRoleResourceRelateDAO;

import net.service.SpringContextAgent;


/**
 * ϵͳ��ɫ����Դ���� DAO Factory GenDate 2011-09-22 10:11:23
 *
 * @author kylin
 */
public class SysRoleResourceRelateDAOFactory {
    /**
     * Get ϵͳ��ɫ����Դ���� DAO Factory
     *
     * @return DOCUMENT ME!
     */
    public static ISysRoleResourceRelateDAO getSysRoleResourceRelateDAO() {
        return (ISysRoleResourceRelateDAO) SpringContextAgent.getBean(ISysRoleResourceRelateDAO.class.getName());
    } // end getSysRoleResourceRelateDAO()
} // end SysRoleResourceRelateDAOFactory
