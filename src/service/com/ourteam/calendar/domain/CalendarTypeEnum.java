/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * 日历类型枚举 Generate date 2011-09-22 10:23:11
 *
 * @author kylin
 *
 * @model
 */
public class CalendarTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new CalendarTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected CalendarTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end CalendarTypeEnum()

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
    public static CalendarTypeEnum getEnum(String arg0) {
        return (CalendarTypeEnum) enumValueMap.get(arg0);
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
     * 
    DOCUMENT ME!
     *
     * @model name="SYSTEM"
     */
    public static final CalendarTypeEnum SYSTEM = new CalendarTypeEnum("SYSTEM",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="TEAM"
     */
    public static final CalendarTypeEnum TEAM = new CalendarTypeEnum("TEAM", "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="PROJECT"
     */
    public static final CalendarTypeEnum PROJECT = new CalendarTypeEnum("PROJECT",
            "");
} // end CalendarTypeEnum
