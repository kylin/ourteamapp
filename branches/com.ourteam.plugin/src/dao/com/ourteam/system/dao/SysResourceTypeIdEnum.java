/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import org.apache.commons.lang.enums.ValuedEnum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 系统资源类型枚举 Generate date 2011-09-22 10:11:26
 *
 * @author kylin
 *
 * @model
 */
public class SysResourceTypeIdEnum extends ValuedEnum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new SysResourceTypeIdEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected SysResourceTypeIdEnum(int arg0, String aDesc) {
        super(aDesc, arg0);
        desc = aDesc;
        enumValueMap.put(Integer.valueOf(arg0), this);
    } // end SysResourceTypeIdEnum()

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
    public static SysResourceTypeIdEnum getEnum(int arg0) {
        return (SysResourceTypeIdEnum) enumValueMap.get(Integer.valueOf(arg0));
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
     * SYS_FUNCTION
     *
     * @model name="SYS_FUNCTION"
     */
    public static final SysResourceTypeIdEnum SYS_FUNCTION = new SysResourceTypeIdEnum(1,
            "SYS_FUNCTION");

    /**
     * SYS_ROLE
     *
     * @model name="SYS_ROLE"
     */
    public static final SysResourceTypeIdEnum SYS_ROLE = new SysResourceTypeIdEnum(2,
            "SYS_ROLE");

    /**
     * SYS_USER
     *
     * @model name="SYS_USER"
     */
    public static final SysResourceTypeIdEnum SYS_USER = new SysResourceTypeIdEnum(3,
            "SYS_USER");

    /**
     * MIDDLEWARE_DATABASE
     *
     * @model name="MIDDLEWARE_DATABASE"
     */
    public static final SysResourceTypeIdEnum MIDDLEWARE_DATABASE = new SysResourceTypeIdEnum(1000,
            "MIDDLEWARE_DATABASE");

    /**
     * MIDDLEWARE_APP_SERVER
     *
     * @model name="MIDDLEWARE_APP_SERVER"
     */
    public static final SysResourceTypeIdEnum MIDDLEWARE_APP_SERVER = new SysResourceTypeIdEnum(1010,
            "MIDDLEWARE_APP_SERVER");
} // end SysResourceTypeIdEnum
