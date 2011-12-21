/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 自定义数据类型状态枚举 Generate date 2011-09-22 10:22:33
 *
 * @author kylin
 *
 * @model
 */
public class CustomDataObjectStatusEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new CustomDataObjectStatusEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected CustomDataObjectStatusEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end CustomDataObjectStatusEnum()

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
    public static CustomDataObjectStatusEnum getEnum(String arg0) {
        return (CustomDataObjectStatusEnum) enumValueMap.get(arg0);
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
     * 启用
     *
     * @model name="ACTIVE"
     */
    public static final CustomDataObjectStatusEnum ACTIVE = new CustomDataObjectStatusEnum("ACTIVE",
            "启用");

    /**
     * 停用
     *
     * @model name="DEACTIVE"
     */
    public static final CustomDataObjectStatusEnum DEACTIVE = new CustomDataObjectStatusEnum("DEACTIVE",
            "停用");
} // end CustomDataObjectStatusEnum
