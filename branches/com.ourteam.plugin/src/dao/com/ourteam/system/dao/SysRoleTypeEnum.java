/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 角色类型枚举 Generate date 2011-09-22 10:11:26
 *
 * @author kylin
 *
 * @model
 */
public class SysRoleTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new SysRoleTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected SysRoleTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end SysRoleTypeEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getDesc() {
        return desc;
    } // end getDesc()

    /**
     * DOCUMENT ME!
     */
    private static Map enumValueMap = new HashMap();

    /**
     * DOCUMENT ME!
     *
     * @param arg0 DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static SysRoleTypeEnum getEnum(String arg0) {
        return (SysRoleTypeEnum) enumValueMap.get(arg0);
    } // end getEnum()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static Collection getEnumList() {
        return enumValueMap.values();
    } // end getEnumList()

    /**
     * 角色
     *
     * @model name="ROLE"
     */
    public static final SysRoleTypeEnum ROLE = new SysRoleTypeEnum("ROLE", "角色");

    /**
     * 角色组
     *
     * @model name="ROLE_GROUP"
     */
    public static final SysRoleTypeEnum ROLE_GROUP = new SysRoleTypeEnum("ROLE_GROUP",
            "角色组");
} // end SysRoleTypeEnum
