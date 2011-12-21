/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-11-30 16:17:47
 *
 * @author kylin
 *
 * @model
 */
public class BpmTaskStatusEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BpmTaskStatusEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BpmTaskStatusEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BpmTaskStatusEnum()

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
    public static BpmTaskStatusEnum getEnum(String arg0) {
        return (BpmTaskStatusEnum) enumValueMap.get(arg0);
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
     * 未指派
     *
     * @model name="UNASSIGNED"
     */
    public static final BpmTaskStatusEnum UNASSIGNED = new BpmTaskStatusEnum("UNASSIGNED",
            "未指派");

    /**
     * 已指派
     *
     * @model name="ASSIGNED"
     */
    public static final BpmTaskStatusEnum ASSIGNED = new BpmTaskStatusEnum("ASSIGNED",
            "已指派");

    /**
     * 已完成
     *
     * @model name="FINISHED"
     */
    public static final BpmTaskStatusEnum FINISHED = new BpmTaskStatusEnum("FINISHED",
            "已完成");

    /**
     * 已取消
     *
     * @model name="CANCELED"
     */
    public static final BpmTaskStatusEnum CANCELED = new BpmTaskStatusEnum("CANCELED",
            "已取消");
} // end BpmTaskStatusEnum
