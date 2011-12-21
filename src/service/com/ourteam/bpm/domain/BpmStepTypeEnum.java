/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.domain;

import org.apache.commons.lang.enums.Enum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * Generate date 2011-10-18 13:56:47
 *
 * @author kylin
 *
 * @model
 */
public class BpmStepTypeEnum extends Enum {
    /**
     * DOCUMENT ME!
     */
    private String desc;

    /**
     * Creates a new BpmStepTypeEnum object.
     *
     * @param arg0 DOCUMENT ME!
     * @param aDesc DOCUMENT ME!
     */
    protected BpmStepTypeEnum(String arg0, String aDesc) {
        super(arg0);
        desc = aDesc;
        enumValueMap.put(arg0, this);
    } // end BpmStepTypeEnum()

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
    public static BpmStepTypeEnum getEnum(String arg0) {
        return (BpmStepTypeEnum) enumValueMap.get(arg0);
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
     * @model name="START_TYPE"
     */
    public static final BpmStepTypeEnum START_TYPE = new BpmStepTypeEnum("START_TYPE",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="CLOSE_TYPE"
     */
    public static final BpmStepTypeEnum CLOSE_TYPE = new BpmStepTypeEnum("CLOSE_TYPE",
            "");

    /**
     * 
    DOCUMENT ME!
     *
     * @model name="GENERAL_TYPE"
     */
    public static final BpmStepTypeEnum GENERAL_TYPE = new BpmStepTypeEnum("GENERAL_TYPE",
            "");
} // end BpmStepTypeEnum
