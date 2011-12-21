/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 系统状态枚举对象 Generate date 2011-09-22 10:11:26
 *
 * @author kylin
 *
 * @model
 */
public class SysResourceStatusEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new SysResourceStatusEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected SysResourceStatusEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end SysResourceStatusEnum()

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
    public static SysResourceStatusEnum getEnum(String arg0) {
        return (SysResourceStatusEnum) enumValueMap.get(arg0);
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
     * 使用中
     *
     * @model name="IN_USE"
     */
    public static final SysResourceStatusEnum IN_USE = new SysResourceStatusEnum("IN_USE",
            "使用中");

    /**
     * 不使用
     *
     * @model name="NOT_USE"
     */
    public static final SysResourceStatusEnum NOT_USE = new SysResourceStatusEnum("NOT_USE",
            "不使用");
} // end SysResourceStatusEnum
