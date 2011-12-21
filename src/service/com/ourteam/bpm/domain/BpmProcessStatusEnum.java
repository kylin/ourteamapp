/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 业务流程状态 Generate date 2011-11-10 13:26:08
 *
 * @author kylin
 *
 * @model
 */
public class BpmProcessStatusEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BpmProcessStatusEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BpmProcessStatusEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BpmProcessStatusEnum()

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
    public static BpmProcessStatusEnum getEnum(String arg0) {
        return (BpmProcessStatusEnum) enumValueMap.get(arg0);
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
     * 启动
     *
     * @model name="STARTED"
     */
    public static final BpmProcessStatusEnum STARTED = new BpmProcessStatusEnum("STARTED",
            "启动");

    /**
     * 取消
     *
     * @model name="CANCELED"
     */
    public static final BpmProcessStatusEnum CANCELED = new BpmProcessStatusEnum("CANCELED",
            "取消");

    /**
     * 完成
     *
     * @model name="FINISHED"
     */
    public static final BpmProcessStatusEnum FINISHED = new BpmProcessStatusEnum("FINISHED",
            "完成");
} // end BpmProcessStatusEnum
